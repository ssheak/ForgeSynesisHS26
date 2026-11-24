package org.jabref.gui.forgesynesis;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.jabref.gui.LibraryTab;
import org.jabref.gui.LibraryTabContainer;
import org.jabref.gui.StateManager;
import org.jabref.model.entry.BibEntry;
import org.jabref.model.entry.LinkedFile;

import java.nio.file.Path;
import java.util.List;

public class ForgeSynesisViewModel {

    private final StringProperty language = new SimpleStringProperty("Deutsch");
    private final StringProperty difficulty = new SimpleStringProperty("Easy");
    private final IntegerProperty quantity = new SimpleIntegerProperty(20);
    private final StringProperty prompt = new SimpleStringProperty("");

    private final StateManager stateManager;
    private final LibraryTabContainer libraryTabContainer;
    private ObservableList<LinkedFile> linkedFiles = FXCollections.observableArrayList();

    private final ForgeSynesisView forgeSynesisView;

    public ForgeSynesisViewModel(LibraryTabContainer libraryTabContainer, StateManager stateManager, ForgeSynesisView forgeSynesisView){
        this.libraryTabContainer = libraryTabContainer;
        this.forgeSynesisView = forgeSynesisView;
        this.stateManager = stateManager;
    }

    /**
     * Retrieves all linked files from the currently active library
     * and updates the observable list of linked files.
     *
     * If no library is currently open, the list remains empty.
     */
    public void updateLinkedFiles() {
        //System.out.println("updateLinkedFiles() called");

        linkedFiles.clear();

        LibraryTab currentTab = libraryTabContainer.getCurrentLibraryTab();

        if (currentTab == null) {
            //System.out.println("No library is currently open.");
            return;
        }

        var entries = currentTab.getBibDatabaseContext()
                .getDatabase()
                .getEntries();

        //System.out.println("Total entries: " + entries.size());

        for (BibEntry entry : entries) {
            linkedFiles.addAll(entry.getFiles());
        }

        //System.out.println("Linked files found: " + linkedFiles.size());
    }

    public void forge(){

    }

    /**
     * Toggles the selected generation language between German and English.
     */
    public void changeLanguage(){
        if ("Deutsch".equals(language.get())){
            language.set("English");
        }else {
            language.set("Deutsch");
        }
    }

    /**
     * Toggles the selected difficulty level between Easy and Hard.
     */
    public void changeDifficulty(){
        if ("Easy".equals(difficulty.get())){
            difficulty.set("Hard");
        }else {
            difficulty.set("Easy");
        }
    }

    /**
     * Toggles the number of flashcards between 10 and 20.
     */
    public void changeQuantity(){
        if (quantity.get() == 20){
            quantity.set(10);
        }else {
            quantity.set(20);
        }
    }

    /**
     * Handles the flashcard generation logic using the selected
     * language, difficulty, quantity and prompt settings.
     */
    public void generateFlashcards(){
        //Flashcard generation logic
    }

    /**
     * Returns the property representing the currently selected generation language.
     *
     * @return the language property
     */
    public StringProperty getLanguageProperty(){
        return language;
    }

    /**
     * Returns the property representing the selected number of flashcards.
     *
     * @return the quantity property
     */
    public IntegerProperty getQuantityProperty(){
        return quantity;
    }

    /**
     * Returns the property representing the selected difficulty.
     *
     * @return the difficulty property
     */
    public StringProperty getDifficultyProperty(){
        return difficulty;
    }

    /**
     * Returns the property containing the user's additional generation prompt.
     *
     * @return the prompt property
     */
    public StringProperty getPromptProperty(){
        return prompt;
    }

    /**
     * Returns the observable list of linked files retrieved from the active library.
     *
     * @return the observable list of linked files
     */
    public ObservableList<LinkedFile> getLinkedFiles(){
        return linkedFiles;
    }

    /**
     * Converts the currently retrieved linked files into SourceDocument objects
     * for use by the Forge Synesis preview and generation components.
     *
     * @return a list of source documents
     */
    public List<SourceDocument> getSourceDocuments() {

        return linkedFiles.stream()
                .map(file -> new SourceDocument(
                        Path.of(file.getLink())
                ))
                .toList();
    }


}
