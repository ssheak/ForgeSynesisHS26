package org.jabref.gui.forgesynesis.deckbrowser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;

import org.jabref.gui.forgesynesis.Flashcard;
import org.jabref.gui.forgesynesis.FlashcardCollection;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;

public class DeckBrowserViewModel {
    private final ObservableList<DeckSummary> decks = FXCollections.observableArrayList();
    private final FilteredList<DeckSummary> filteredDecks = new FilteredList<>(decks);
    private final ObjectProperty<DeckSummary> selectedDeck = new SimpleObjectProperty<>();
    private final StringProperty searchText = new SimpleStringProperty("");

    public DeckBrowserViewModel() {
        searchText.addListener((observable, oldValue, newValue) -> applyFilter(newValue));
    }

    public boolean loadDeck(Path file) throws IOException {
        if (!Files.isRegularFile(file) || !file.toString().toLowerCase().endsWith(".json")) {
            throw new IOException("Choose a Forge Synesis JSON collection.");
        }

        FlashcardCollection collection;
        try (Reader reader = Files.newBufferedReader(file)) {
            collection = new Gson().fromJson(reader, FlashcardCollection.class);
        } catch (JsonParseException exception) {
            throw new IOException("The selected file is not a valid flashcard collection.", exception);
        }
        validateCollection(collection);

        Path normalizedPath = file.toAbsolutePath().normalize();
        for (DeckSummary deck : decks) {
            if (deck.getFile().equals(normalizedPath)) {
                return false;
            }
        }

        DeckSummary deck = new DeckSummary(normalizedPath, collection);
        decks.add(deck);
        selectedDeck.set(deck);
        return true;
    }

    public void selectDeck(DeckSummary deck) {
        selectedDeck.set(deck);
    }

    public void removeSelectedDeck() {
        DeckSummary current = selectedDeck.get();
        if (current != null) {
            decks.remove(current);
            selectedDeck.set(null);
        }
    }

    public void applyFilter(String value) {
        String query = value == null ? "" : value.trim().toLowerCase();
        filteredDecks.setPredicate(deck -> query.isBlank()
                || deck.getTitle().toLowerCase().contains(query)
                || sourcesAsText(deck.getCollection().getSources()).contains(query));
    }

    public ObservableList<DeckSummary> getDecks() {
        return filteredDecks;
    }

    public ObjectProperty<DeckSummary> selectedDeckProperty() {
        return selectedDeck;
    }

    public DeckSummary getSelectedDeck() {
        return selectedDeck.get();
    }

    public StringProperty searchTextProperty() {
        return searchText;
    }

    private static String sourcesAsText(List<String> sources) {
        return sources == null ? "" : String.join(" ", sources).toLowerCase();
    }

    private static void validateCollection(FlashcardCollection collection) throws IOException {
        if (collection == null || collection.getCards() == null) {
            throw new IOException("The selected file does not contain a flashcard collection.");
        }

        for (Flashcard card : collection.getCards()) {
            if (card == null || card.getQuestion() == null || card.getQuestion().isBlank()
                    || card.getAnswer() == null || card.getAnswer().isBlank()) {
                throw new IOException("The collection contains an incomplete flashcard.");
            }
        }
    }
}