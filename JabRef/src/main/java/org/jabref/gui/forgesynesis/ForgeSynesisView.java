package org.jabref.gui.forgesynesis;

import com.airhacks.afterburner.views.ViewLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

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

    public ForgeSynesisView() {

        ViewLoader.view(this).root(this).load();
    }

    @FXML
    private void forgeLearningCards(){
        System.out.println("Test");
    }

    @FXML
    private void changeLanguage(){
        if(languageSwitch.isSelected()){
            languageSwitch.setText("English");
            System.out.println("English");
        }else{
            languageSwitch.setText("Deutsch");
            System.out.println("Deutsch");
        }
    }

    @FXML
    private void changeQuantity(){
        if(quantitySwitch.isSelected()){
            quantitySwitch.setText("10");
        }else{
            quantitySwitch.setText("20");
        }
    }

    @FXML
    private void changeDifficulty(){
        if(difficultySwitch.isSelected()){
            difficultySwitch.setText("Hard");
        }else{
            difficultySwitch.setText("Easy");
        }
    }

}
