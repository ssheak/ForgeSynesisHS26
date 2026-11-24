package org.jabref.gui.forgesynesis;

import java.util.List;

public class GenerationRequest {

    private GenerationSettings generationSettings;
    private String optionalPrompt;
    private List<SourceDocument> selectedFiles;
    public GenerationRequest(GenerationSettings generationSettings, String optionalPrompt, List<SourceDocument> selectedFiles){
        this.generationSettings = generationSettings;
        this.optionalPrompt = optionalPrompt;
        this.selectedFiles = selectedFiles;
    }

}
