package org.jabref.gui.forgesynesis;

import javafx.beans.Observable;
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

    //Retrieve the bibliographic entries
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

    public void changeLanguage(){
        if ("Deutsch".equals(language.get())){
            language.set("English");
        }else {
            language.set("Deutsch");
        }
    }

    //implement with enum: Easy, Medium, Hard
    public void changeDifficulty(){
        if ("Easy".equals(difficulty.get())){
            difficulty.set("Hard");
        }else {
            difficulty.set("Easy");
        }
    }

    public void changeQuantity(){
        if (quantity.get() == 20){
            quantity.set(10);
        }else {
            quantity.set(20);
        }
    }

    public void generateFlashcards(){
        //Flashcard generation logic
    }

    public StringProperty getLanguageProperty(){
        return language;
    }

    public IntegerProperty getQuantityProperty(){
        return quantity;
    }

    public StringProperty getDifficultyProperty(){
        return difficulty;
    }

    public StringProperty getPromptProperty(){
        return prompt;
    }

    public ObservableList<LinkedFile> getLinkedFiles(){
        return linkedFiles;
    }
    public List<SourceDocument> getSourceDocuments() {

        return linkedFiles.stream()
                .map(file -> new SourceDocument(
                        Path.of(file.getLink())
                ))
                .toList();
    }


}
