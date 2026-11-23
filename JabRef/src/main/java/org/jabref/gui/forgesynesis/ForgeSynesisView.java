package org.jabref.gui.forgesynesis;

import com.airhacks.afterburner.views.ViewLoader;
import javafx.collections.ListChangeListener;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import org.jabref.gui.LibraryTab;
import org.jabref.gui.LibraryTabContainer;
import org.jabref.gui.StateManager;
import org.jabref.model.entry.BibEntry;

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

    }

    @FXML
    public void initialize(){
        languageSwitch.textProperty().bind(viewModel.getLanguageProperty());
        difficultySwitch.textProperty().bind(viewModel.getDifficultyProperty());
        quantitySwitch.textProperty().bind(viewModel.getQuantityProperty().asString());
    }

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

    public void loadLinkedFiles() {
        System.out.println("loadLinkedFiles() called");

        viewModel.updateLinkedFiles();

        List<SourceDocument> documents = viewModel.getSourceDocuments();

        System.out.println("Documents found: " + documents.size());

        displayPdfFiles(documents);
    }


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

    @FXML
    public void openDeckPreview(){
        System.out.println("Open Deckpreview");
        mainContainer.showDeck();
    }
    @FXML
    private void forgeLearningCards(){
        System.out.println("Send request to Gemini API");
    }


    @FXML
    private void changeLanguage(){
        viewModel.changeLanguage();
    }
    @FXML
    private void changeQuantity(){
        viewModel.changeQuantity();
    }
    @FXML
    private void changeDifficulty(){
        viewModel.changeDifficulty();
    }

}
