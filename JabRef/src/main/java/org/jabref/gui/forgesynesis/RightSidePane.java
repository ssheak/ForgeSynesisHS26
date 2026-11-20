package org.jabref.gui.forgesynesis;

import javafx.scene.control.SplitPane;
import javafx.scene.layout.VBox;
import org.jabref.gui.StateManager;

//Optional panel on the right side, since SidePanel is locked on the left. (Unused class)
public class RightSidePane extends VBox {

    //private final ForgeSynesisView forgeSynesisView;

    private final StateManager stateManager;

    public RightSidePane(StateManager stateManager){
        this.stateManager = stateManager;
    }


}
