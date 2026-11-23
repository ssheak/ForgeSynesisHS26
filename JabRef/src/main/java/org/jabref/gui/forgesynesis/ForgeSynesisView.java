package org.jabref.gui.forgesynesis;

import com.airhacks.afterburner.views.ViewLoader;
import javafx.application.Platform;
import com.google.common.eventbus.Subscribe;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import org.jabref.gui.LibraryTab;
import org.jabref.gui.LibraryTabContainer;
import org.jabref.gui.StateManager;
import org.jabref.model.database.event.EntriesAddedEvent;
import org.jabref.model.database.event.EntriesRemovedEvent;
import org.jabref.model.entry.event.EntryChangedEvent;

import java.util.List;

public class ForgeSynesisView extends AnchorPane {

    @FXML
    private Button forgeButton;
    @FXML
    private ToggleButton difficultySwitch;
    @FXML
    private ToggleButton quantitySwitch;
    @FXML
    private ToggleButton languageSwitch;
    @FXML
    private Button deckButton;
    @FXML
    private TextArea promptArea;
    @FXML
    private ScrollPane previewPane;
    @FXML
    private VBox previewBox;

    private final ForgeSynesisViewModel viewModel;
    private final ForgeSynesisMainContainer mainContainer;
    private final StateManager stateManager;
    private final LibraryTabContainer tabContainer;


    public ForgeSynesisView(LibraryTabContainer tabContainer, StateManager stateManager, ForgeSynesisMainContainer mainContainer) {
        this.stateManager = stateManager;
        this.viewModel = new ForgeSynesisViewModel(tabContainer, stateManager, this);
        this.mainContainer = mainContainer;
        this.tabContainer = tabContainer;

        ViewLoader.view(this).root(this).load();

        registerDatabaseListener();

    }

    @FXML
    public void initialize(){
        languageSwitch.textProperty().bind(viewModel.getLanguageProperty());
        difficultySwitch.textProperty().bind(viewModel.getDifficultyProperty());
        quantitySwitch.textProperty().bind(viewModel.getQuantityProperty().asString());
    }

    /**
     * Refreshes the linked-file preview by retrieving the latest files
     * from the currently active library.
     */
    public void refreshLinkedFiles() {

        System.out.println("Refreshing linked files...");

        var selectedEntries = stateManager.getSelectedEntries();

        System.out.println("StateManager: " + stateManager);
        System.out.println("Selected entries: " + selectedEntries.size());

        selectedEntries.forEach(entry -> {
            System.out.println("Entry: " + entry.getCitationKey());
            System.out.println("Files: " + entry.getFiles().size());
        });

        loadLinkedFiles();
    }

    /**
     * Registers this view as a listener to the currently active library's
     * database so that changes to its entries can trigger a preview refresh.
     */
    private void registerDatabaseListener() {
        LibraryTab currentTab = tabContainer.getCurrentLibraryTab();

        if (currentTab == null) {
            return;
        }

        currentTab.getBibDatabaseContext()
                .getDatabase()
                .registerListener(this);
    }

    /**
     * Handles events indicating that new entries have been added, changed or deleted in the database.
     * Triggers a refresh of the linked-file preview.
     *
     * @param event the event containing information about the added entries
     */
    @Subscribe
    public void handleEntryAdded(EntriesAddedEvent event) {
        refreshPreview();
    }

    @Subscribe
    public void handleEntryChanged(EntryChangedEvent event) {
        refreshPreview();
    }

    @Subscribe
    public void handleEntryChanged(EntriesRemovedEvent event) {
        refreshPreview();
    }

    /**
     * Schedules a preview refresh on the JavaFX Application Thread.
     * This ensures that UI components are updated safely after database events.
     */
    private void refreshPreview() {
        Platform.runLater(this::refreshLinkedFiles);
    }

    /**
     * Retrieves the latest linked files through the view model and
     * passes the resulting source documents to the preview component.
     */
    public void loadLinkedFiles() {
        System.out.println("loadLinkedFiles() called");

        viewModel.updateLinkedFiles();

        List<SourceDocument> documents = viewModel.getSourceDocuments();

        System.out.println("Documents found: " + documents.size());

        displayPdfFiles(documents);
    }

    /**
    * Updates the preview area by creating a checkbox for every existing entry in the database.
     *
     * @param files the source documents to display
     */
    public void displayPdfFiles(List<SourceDocument> files) {
        System.out.println("displayPdfFiles() called");

        previewBox.getChildren().clear();

        for (SourceDocument file : files) {
            System.out.println("Adding checkbox for: " + file.getFileName());

            CheckBox checkBox = new CheckBox(file.getFileName());
            checkBox.setUserData(file);

            previewBox.getChildren().add(checkBox);
        }

        System.out.println("Preview children: " + previewBox.getChildren().size());
    }

    /**
     * Opens the deck preview within the Forge Synesis main container.
     */
    @FXML
    public void openDeckPreview(){
        System.out.println("Open Deckpreview");
        mainContainer.showDeck();
    }

    /**
     * Initiates the flashcard generation process using the configured settings.
     */
    @FXML
    private void forgeLearningCards(){
        System.out.println("Send request to Gemini API");
    }

    /**
     * Toggles the generated language between german and english.
     */
    @FXML
    private void changeLanguage(){
        viewModel.changeLanguage();
    }

    /**
     * Toggles the flashcard quantity.
     */
    @FXML
    private void changeQuantity(){
        viewModel.changeQuantity();
    }

    /**
     * Toggles the difficulty between easy and hard.
     *
     * (Medium has to be added)
     */
    @FXML
    private void changeDifficulty(){
        viewModel.changeDifficulty();
    }

}
