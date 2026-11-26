package org.jabref.gui.forgesynesis;

import javafx.scene.layout.StackPane;

import org.jabref.gui.DialogService;
import org.jabref.gui.LibraryTabContainer;
import org.jabref.gui.StateManager;
import org.jabref.gui.forgesynesis.api.ForgeSynesisService;
import org.jabref.gui.forgesynesis.deckbrowser.DeckBrowserView;
import org.jabref.gui.forgesynesis.mainwindow.ForgeSynesisView;

public class ForgeSynesisMainContainer extends StackPane {
    private final ForgeSynesisView forgeSynesisView;

    private final ForgeSynesisService forgeSynesisService;
    private final DeckBrowserView deckBrowserView;

    public ForgeSynesisMainContainer(LibraryTabContainer libraryTabContainer,
                                     StateManager stateManager,
                                     DialogService dialogService) {
        forgeSynesisService = new ForgeSynesisService();
        forgeSynesisView = new ForgeSynesisView(libraryTabContainer, stateManager, forgeSynesisService, this);
        deckBrowserView = new DeckBrowserView(this, dialogService);

        getChildren().addAll(forgeSynesisView, deckBrowserView);

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