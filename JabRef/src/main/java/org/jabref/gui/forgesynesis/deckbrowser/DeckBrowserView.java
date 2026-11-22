package org.jabref.gui.forgesynesis.deckbrowser;

import com.airhacks.afterburner.views.ViewLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import org.jabref.gui.StateManager;
import org.jabref.gui.forgesynesis.ForgeSynesisMainContainer;

public class DeckBrowserView extends AnchorPane {

    @FXML
    private Button goForgeButton;

    private final StateManager stateManager;
    private final ForgeSynesisMainContainer mainContainer;

    public DeckBrowserView(StateManager stateManager, ForgeSynesisMainContainer mainContainer){
        this.stateManager = stateManager;
        this.mainContainer = mainContainer;
        ViewLoader.view(this).root(this).load();
    }

    public void initialize(){

    }

    @FXML
    public void openForgeWindow(){
        System.out.println("Open Forge");
        mainContainer.showForge();
    }

}
