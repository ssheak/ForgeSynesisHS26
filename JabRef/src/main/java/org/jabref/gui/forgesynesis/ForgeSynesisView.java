package org.jabref.gui.forgesynesis;

import com.airhacks.afterburner.views.ViewLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import org.jabref.gui.StateManager;

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
    private ToggleButton extraButton;
    @FXML
    private TextArea promptArea;
    @FXML
    private CheckBox checkBox;
    @FXML
    private ScrollPane previewPane;
    @FXML
    private VBox previewBox;

    private final ForgeSynesisViewModel viewModel;

    public ForgeSynesisView(StateManager stateManager) {
        this.viewModel = new ForgeSynesisViewModel(stateManager);
        ViewLoader.view(this).root(this).load();

        initializeBindings();
    }

    public void initializeBindings(){
        //initialize bindings with ViewModel
    }

    @FXML
    private void forgeLearningCards(){
        System.out.println("Test");
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

}
