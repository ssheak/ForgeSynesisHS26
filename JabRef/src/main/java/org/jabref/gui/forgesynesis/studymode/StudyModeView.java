package org.jabref.gui.forgesynesis.studymode;

import java.util.List;
import java.util.Objects;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import org.jabref.gui.forgesynesis.Flashcard;
import org.jabref.gui.forgesynesis.FlashcardCollection;
import org.jabref.gui.util.BaseDialog;

import com.airhacks.afterburner.views.ViewLoader;

public class StudyModeView extends BaseDialog<Void> {
    @FXML private Label deckNameLabel;
    @FXML private Label cardPositionLabel;
    @FXML private Label questionLabel;
    @FXML private Label answerLabel;
    @FXML private Label sessionSummaryLabel;
    @FXML private VBox cardContent;
    @FXML private VBox summaryContent;
    @FXML private Button revealButton;
    @FXML private Button correctButton;
    @FXML private Button incorrectButton;

    private final FlashcardCollection collection;
    private List<Flashcard> cards;
    private int currentIndex;
    private int correctAnswers;
    private int incorrectAnswers;

    public StudyModeView(FlashcardCollection collection) {
        this.collection = Objects.requireNonNull(collection);
        ViewLoader.view(this)
                  .load()
                  .setAsDialogPane(this);
        setTitle("Forge Synesis — Study Mode");
    }

    @FXML
    private void initialize() {
        cards = collection.getCards() == null ? List.of() : collection.getCards();
        deckNameLabel.setText(collection.getTopic() == null || collection.getTopic().isBlank()
                ? "Flashcard study session"
                : collection.getTopic());

        correctButton.setDisable(true);
        incorrectButton.setDisable(true);

        if (cards.isEmpty()) {
            cardContent.setVisible(false);
            cardContent.setManaged(false);
            summaryContent.setVisible(true);
            summaryContent.setManaged(true);
            sessionSummaryLabel.setText("This deck has no cards to study.");
        } else {
            showCurrentCard();
        }
    }

    @FXML
    private void revealAnswer() {
        answerLabel.setVisible(true);
        answerLabel.setManaged(true);
        revealButton.setDisable(true);
        correctButton.setDisable(false);
        incorrectButton.setDisable(false);
    }

    @FXML
    private void markCorrect() {
        correctAnswers++;
        showNextCard();
    }

    @FXML
    private void markIncorrect() {
        incorrectAnswers++;
        showNextCard();
    }

    private void showNextCard() {
        currentIndex++;
        if (currentIndex >= cards.size()) {
            showSummary();
        } else {
            showCurrentCard();
        }
    }

    private void showCurrentCard() {
        Flashcard card = cards.get(currentIndex);
        cardPositionLabel.setText("Card " + (currentIndex + 1) + " of " + cards.size());
        questionLabel.setText(card.getQuestion());
        answerLabel.setText(card.getAnswer());
        answerLabel.setVisible(false);
        answerLabel.setManaged(false);
        revealButton.setDisable(false);
        correctButton.setDisable(true);
        incorrectButton.setDisable(true);
    }

    private void showSummary() {
        cardContent.setVisible(false);
        cardContent.setManaged(false);
        summaryContent.setVisible(true);
        summaryContent.setManaged(true);
        sessionSummaryLabel.setText("Session complete\n\nCorrect: " + correctAnswers
                + "\nIncorrect: " + incorrectAnswers);
    }
}