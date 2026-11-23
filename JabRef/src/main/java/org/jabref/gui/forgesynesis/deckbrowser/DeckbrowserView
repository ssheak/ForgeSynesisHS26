package org.jabref.gui.forgesynesis.deckbrowser;

import java.io.IOException;
import java.nio.file.Path;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

import org.jabref.gui.DialogService;
import org.jabref.gui.forgesynesis.ForgeSynesisMainContainer;
import org.jabref.gui.forgesynesis.studymode.StudyModeView;
import org.jabref.gui.util.FileDialogConfiguration;

import com.airhacks.afterburner.views.ViewLoader;

public class DeckBrowserView extends AnchorPane {
    @FXML private ListView<DeckSummary> deckList;
    @FXML private TextField searchField;
    @FXML private Label emptyStateLabel;
    @FXML private Label deckTitleLabel;
    @FXML private Label topicLabel;
    @FXML private Label cardCountLabel;
    @FXML private Label sourceLabel;
    @FXML private Label statusLabel;
    @FXML private Button studyButton;
    @FXML private Button removeButton;
    @FXML private VBox deckDetails;

    private final ForgeSynesisMainContainer mainContainer;
    private final DialogService dialogService;
    private final DeckBrowserViewModel viewModel = new DeckBrowserViewModel();

    public DeckBrowserView(ForgeSynesisMainContainer mainContainer,
                           DialogService dialogService) {
        this.mainContainer = mainContainer;
        this.dialogService = dialogService;
        ViewLoader.view(this).root(this).load();
    }

    @FXML
    public void initialize() {
        searchField.textProperty().bindBidirectional(viewModel.searchTextProperty());
        deckList.setItems(viewModel.getDecks());

        deckList.setCellFactory(list -> new ListCell<>() {
            @Override
            protected void updateItem(DeckSummary deck, boolean empty) {
                super.updateItem(deck, empty);
                if (empty || deck == null) {
                    setText(null);
                } else {
                    setText(deck.getTitle() + "  ·  " + deck.getCardCount() + " cards");
                }
            }
        });

        deckList.getSelectionModel().selectedItemProperty().addListener((observable, oldDeck, newDeck) -> {
            viewModel.selectDeck(newDeck);
            updateDetails(newDeck);
        });

        studyButton.disableProperty().bind(viewModel.selectedDeckProperty().isNull());
        removeButton.disableProperty().bind(viewModel.selectedDeckProperty().isNull());
        updateDetails(null);
    }

    @FXML
    public void openForgeWindow() {
        mainContainer.showForge();
    }

    @FXML
    private void importDeck() {
        FileChooser.ExtensionFilter jsonFilter =
                new FileChooser.ExtensionFilter("Forge Synesis decks (*.json)", "*.json");

        FileDialogConfiguration configuration = new FileDialogConfiguration.Builder()
                .addExtensionFilter(jsonFilter)
                .build();

        dialogService.showFileOpenDialog(configuration).ifPresent(this::loadDeck);
    }

    @FXML
    private void removeDeckFromList() {
        viewModel.removeSelectedDeck();
        deckList.getSelectionModel().clearSelection();
        statusLabel.setText("Removed from this browser session. The JSON file was not deleted.");
        updateDetails(null);
    }

    @FXML
    private void studySelectedDeck() {
        DeckSummary deck = viewModel.getSelectedDeck();
        if (deck != null) {
            new StudyModeView(deck.getCollection()).showAndWait();
        }
    }

    private void loadDeck(Path file) {
        try {
            boolean added = viewModel.loadDeck(file);
            if (added) {
                deckList.getSelectionModel().select(viewModel.getSelectedDeck());
                statusLabel.setText("Loaded " + file.getFileName() + ".");
            } else {
                statusLabel.setText("That deck is already in the list.");
            }
        } catch (IOException exception) {
            dialogService.showErrorDialogAndWait("Could not load deck", exception.getMessage());
        }
    }

    private void updateDetails(DeckSummary deck) {
        boolean hasDeck = deck != null;
        deckDetails.setVisible(hasDeck);
        deckDetails.setManaged(hasDeck);
        emptyStateLabel.setVisible(!hasDeck);
        emptyStateLabel.setManaged(!hasDeck);

        if (!hasDeck) {
            deckTitleLabel.setText("");
            topicLabel.setText("");
            cardCountLabel.setText("");
            sourceLabel.setText("");
            return;
        }

        deckTitleLabel.setText(deck.getTitle());
        topicLabel.setText(deck.getCollection().getTopic() == null
                || deck.getCollection().getTopic().isBlank()
                ? "No topic specified"
                : deck.getCollection().getTopic());
        cardCountLabel.setText(deck.getCardCount() + " cards");
        sourceLabel.setText(deck.getCollection().getSources() == null
                || deck.getCollection().getSources().isEmpty()
                ? "No source listed"
                : String.join(", ", deck.getCollection().getSources()));
    }
}