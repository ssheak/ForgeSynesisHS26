package org.jabref.gui.forgesynesis.api;

import org.jabref.gui.forgesynesis.SourceDocument;
import org.jabref.gui.forgesynesis.generation.GenerationRequest;
import org.jabref.gui.forgesynesis.generation.GenerationSettings;
import org.jabref.logic.l10n.Language;

import java.util.List;

public class ForgeSynesisService {

    public ForgeSynesisService(){

    }

    public void createGenerationRequest(String language, String difficulty, int quantity, String prompt, List<SourceDocument> files){
        GenerationSettings generationSettings = new GenerationSettings(
                language,
                difficulty,
                quantity,
                prompt
        );

        GenerationRequest generationRequest = new GenerationRequest(
                generationSettings,
                files

        );

        System.out.println("Sending request to Gemini API");
        ForgeSynesisApiClient apiClient = new ForgeSynesisApiClient();
        apiClient.sendRequest();
    }




}
