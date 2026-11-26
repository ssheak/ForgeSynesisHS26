package org.jabref.gui.forgesynesis.generation;

import org.jabref.gui.forgesynesis.SourceDocument;

import java.util.List;

public class GenerationRequest {

    private GenerationSettings generationSettings;
    private List<SourceDocument> selectedFiles;
    public GenerationRequest(GenerationSettings generationSettings, List<SourceDocument> selectedFiles){
        this.generationSettings = generationSettings;
        this.selectedFiles = selectedFiles;
    }

}
