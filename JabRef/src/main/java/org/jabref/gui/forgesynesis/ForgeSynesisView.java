package org.jabref.gui.forgesynesis;

import com.airhacks.afterburner.views.ViewLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import org.jabref.gui.StateManager;

import java.awt.desktop.SystemEventListener;
import java.nio.file.Path;
import java.util.List;

public class ForgeSynesisView extends AnchorPane {

    @FXML
    private Button forgeButton;
    @FXML
    private ToggleButton difficultySwitch;
    @FXML
    private ToggleButton quantitySwitch;
    @FXML
    private ToggleButton languageSwitch;
    @FXML
    private Button deckButton;
    @FXML
    private TextArea promptArea;
    @FXML
    private ScrollPane previewPane;
    @FXML
    private VBox previewBox;

    private final ForgeSynesisViewModel viewModel;

    public ForgeSynesisView(StateManager stateManager) {
        this.viewModel = new ForgeSynesisViewModel(stateManager);
        ViewLoader.view(this).root(this).load();
        testPdfPreview();

        initializeBindings();
    }

    public void initializeBindings(){
        //initialize bindings with ViewModel
    }


    //Test if the list in the preview gets expanded
    private void testPdfPreview() {

        List<SourceDocument> testFiles = List.of(
                new SourceDocument(Path.of("C:/Uni/Statistics.pdf")),
                new SourceDocument(Path.of("C:/Uni/ArtificialIntelligence.pdf")),
                new SourceDocument(Path.of("C:/Uni/NeuralNetworks.pdf")),
                new SourceDocument(Path.of("C:/Uni/Statistics.pdf")),
                new SourceDocument(Path.of("C:/Uni/ArtificialIntelligence.pdf")),
                new SourceDocument(Path.of("C:/Uni/NeuralNetworks.pdf")),
                new SourceDocument(Path.of("C:/Uni/Statistics.pdf")),
                new SourceDocument(Path.of("C:/Uni/ArtificialIntelligence.pdf")),
                new SourceDocument(Path.of("C:/Uni/NeuralNetworks.pdf")),
                new SourceDocument(Path.of("C:/Uni/Statistics.pdf")),
                new SourceDocument(Path.of("C:/Uni/ArtificialIntelligence.pdf")),
                new SourceDocument(Path.of("C:/Uni/NeuralNetworks.pdf"))
        );

        displayPdfFiles(testFiles);
    }

    public void displayPdfFiles(List<SourceDocument> files){

        previewBox.getChildren().clear();

        for(SourceDocument file : files){

            CheckBox checkBox = new CheckBox(file.getFileName());

            checkBox.setUserData(file);
            previewBox.getChildren().add(checkBox);

        }

    }

    @FXML
    public void openDeckPreview(){
        System.out.println("Open Deckpreview");
    }
    @FXML
    private void forgeLearningCards(){
        System.out.println("Send request to Gemini API");
    }

    @FXML
    private void changeLanguage(){
        viewModel.changeLanguage();
    }

    @FXML
    private void changeQuantity(){
        viewModel.changeQuantity();
    }

    @FXML
    private void changeDifficulty(){
        viewModel.changeDifficulty();
    }

    public List<SourceDocument> getSelectedFiles() {

        return previewBox.getChildren()
                .stream()
                .filter(node -> node instanceof CheckBox)
                .map(node -> (CheckBox) node)
                .filter(CheckBox::isSelected)
                .map(checkBox -> (SourceDocument) checkBox.getUserData())
                .toList();
    }

}
