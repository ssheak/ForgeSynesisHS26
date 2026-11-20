package org.jabref.gui.forgesynesis;

import javafx.beans.Observable;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.jabref.gui.StateManager;
import org.jabref.model.entry.BibEntry;
import org.jabref.model.entry.LinkedFile;

import java.util.List;

public class ForgeSynesisViewModel {

    private final StringProperty language = new SimpleStringProperty("Deutsch");
    private final StringProperty difficulty = new SimpleStringProperty("Easy");
    private final IntegerProperty quantity = new SimpleIntegerProperty(20);
    private final StringProperty prompt = new SimpleStringProperty("");

    private final StateManager stateManager;
    private ObservableList<LinkedFile> linkedFiles = FXCollections.observableArrayList();

    public ForgeSynesisViewModel(StateManager stateManager){
        this.stateManager = stateManager;
        updateLinkedFiles();
    }

    //retrieve the currently selected bibliography entry and its linked files. Update Observable list
    public void updateLinkedFiles() {
        System.out.println("test updateFiles");
        linkedFiles.clear();

        stateManager.getSelectedEntries()
                .stream()
                .findFirst()
                .ifPresent(entry -> {
                    linkedFiles.setAll(entry.getFiles());

                    System.out.println("Selected entry: " + entry);
                    System.out.println("Number of linked files: " + linkedFiles.size());

                    for (LinkedFile file : linkedFiles) {
                        System.out.println("File: " + file.getLink());
                        System.out.println("Description: " + file.getDescription());
                    }
                });
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

    public StringProperty getLanguage(){
        return language;
    }

    public IntegerProperty getQuantity(){
        return quantity;
    }

    public StringProperty getDifficulty(){
        return difficulty;
    }

    public StringProperty getPrompt(){
        return prompt;
    }

    public ObservableList<LinkedFile> getLinkedFiles(){
        return linkedFiles;
    }

}
