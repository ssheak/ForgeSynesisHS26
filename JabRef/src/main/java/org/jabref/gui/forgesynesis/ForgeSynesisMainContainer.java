package org.jabref.gui.forgesynesis;
import javafx.scene.layout.StackPane;
import org.jabref.gui.LibraryTabContainer;
import org.jabref.gui.StateManager;
import org.jabref.gui.forgesynesis.deckbrowser.DeckBrowserView;

public class ForgeSynesisMainContainer extends StackPane {

    private final ForgeSynesisView forgeSynesisView;
    private final DeckBrowserView deckBrowserView;


    public ForgeSynesisMainContainer(LibraryTabContainer libraryTabContainer, StateManager stateManager){
        forgeSynesisView = new ForgeSynesisView(libraryTabContainer, stateManager, this);
        deckBrowserView = new DeckBrowserView(stateManager, this);

        getChildren().addAll(
                forgeSynesisView,
                deckBrowserView
        );

        showForge();
        forgeSynesisView.refreshLinkedFiles();

    }

    /**
     * Changes the view to show generation window.
     */
    public void showForge(){
        forgeSynesisView.setVisible(true);
        deckBrowserView.setVisible(false);
        forgeSynesisView.toFront();
    }

    /**
     * Changes the view to show deck browser.
     */
    public void showDeck() {
        forgeSynesisView.setVisible(false);
        deckBrowserView.setVisible(true);
        deckBrowserView.toFront();
    }

}
