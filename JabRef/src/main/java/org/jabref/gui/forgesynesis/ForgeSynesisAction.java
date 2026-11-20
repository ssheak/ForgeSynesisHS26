package org.jabref.gui.forgesynesis;

import com.airhacks.afterburner.injection.Injector;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.jabref.gui.DialogService;
import org.jabref.gui.StateManager;
import org.jabref.gui.actions.SimpleCommand;
import org.jabref.gui.actions.StandardActions;

public class ForgeSynesisAction extends SimpleCommand {

    private final StateManager stateManager;

    public ForgeSynesisAction(StateManager stateManager){
        this.stateManager = stateManager;
    }

    //Todo: Stop making a new stage, instead toggle the window, if we want an integrated panel

    @Override
    public void execute() {


        System.out.println("Till here");
    }
}
