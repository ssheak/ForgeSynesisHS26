package org.jabref.gui.forgesynesis.generation;

import javafx.beans.property.StringProperty;

public class GenerationSettings {

    private final String language;
    private final int quantity;
    private final String difficulty;

    private final String additionalPrompt;

    public GenerationSettings(String language, String difficulty, int quantity, String additionalPrompt){
        this.language = language;
        this.difficulty = difficulty;
        this.quantity = quantity;
        this.additionalPrompt = additionalPrompt;
    }

    public String getLanguage(){
        return language;
    }

    public String getDifficulty(){
        return difficulty;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getAdditionalPrompt(){
        return additionalPrompt;
    }


}
