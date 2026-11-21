package org.jabref.gui.forgesynesis;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import org.jabref.gui.StateManager;
import org.jabref.gui.forgesynesis.deckbrowser.DeckBrowserView;

public class ForgeSynesisMainContainer extends StackPane {

    private final ForgeSynesisView forgeSynesisView;
    private final DeckBrowserView deckBrowserView;

    private StateManager stateManager;

    public ForgeSynesisMainContainer(StateManager stateManager){
        forgeSynesisView = new ForgeSynesisView(stateManager, this);
        deckBrowserView = new DeckBrowserView(stateManager, this);

        getChildren().addAll(
                forgeSynesisView,
                deckBrowserView
        );

        showForge();

    }

    public void showForge(){
        forgeSynesisView.setVisible(true);
        deckBrowserView.setVisible(false);
        forgeSynesisView.toFront();
    }

    public void showDeck() {
        forgeSynesisView.setVisible(false);
        deckBrowserView.setVisible(true);
        deckBrowserView.toFront();
    }

}
