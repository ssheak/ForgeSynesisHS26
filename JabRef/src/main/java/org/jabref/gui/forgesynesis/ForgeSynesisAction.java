package org.jabref.gui.forgesynesis;

import com.airhacks.afterburner.injection.Injector;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.jabref.gui.DialogService;
import org.jabref.gui.actions.SimpleCommand;

public class ForgeSynesisAction extends SimpleCommand {



    @Override
    public void execute() {
        ForgeSynesisView view = new ForgeSynesisView();

        Stage stage = new Stage();
        stage.setTitle("Forge Synesis");
        stage.setScene(new Scene(view, 600, 400));
        stage.show();
    }
}
