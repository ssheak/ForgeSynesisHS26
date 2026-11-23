package org.jabref.gui.forgesynesis.deckbrowser;

import java.nio.file.Path;

import org.jabref.gui.forgesynesis.FlashcardCollection;

public class DeckSummary {
    private final Path file;
    private final FlashcardCollection collection;

    public DeckSummary(Path file, FlashcardCollection collection) {
        this.file = file;
        this.collection = collection;
    }

    public Path getFile() {
        return file;
    }

    public FlashcardCollection getCollection() {
        return collection;
    }

    public String getTitle() {
        if (collection.getTopic() != null && !collection.getTopic().isBlank()) {
            return collection.getTopic();
        }

        String filename = file.getFileName().toString();
        if (filename.toLowerCase().endsWith(".json")) {
            return filename.substring(0, filename.length() - 5);
        }

        return filename;
    }

    public int getCardCount() {
        return collection.getCards() == null ? 0 : collection.getCards().size();
    }
}