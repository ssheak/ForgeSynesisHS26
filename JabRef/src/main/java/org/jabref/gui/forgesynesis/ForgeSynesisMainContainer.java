package org.jabref.gui.forgesynesis;

import javafx.scene.layout.StackPane;

import org.jabref.gui.DialogService;
import org.jabref.gui.LibraryTabContainer;
import org.jabref.gui.StateManager;
import org.jabref.gui.forgesynesis.deckbrowser.DeckBrowserView;

public class ForgeSynesisMainContainer extends StackPane {
    private final ForgeSynesisView forgeSynesisView;
    private final DeckBrowserView deckBrowserView;

    public ForgeSynesisMainContainer(LibraryTabContainer libraryTabContainer,
                                     StateManager stateManager,
                                     DialogService dialogService) {
        forgeSynesisView = new ForgeSynesisView(libraryTabContainer, stateManager, this);
        deckBrowserView = new DeckBrowserView(this, dialogService);

        getChildren().addAll(forgeSynesisView, deckBrowserView);

        showForge();
        forgeSynesisView.refreshLinkedFiles();
    }

    public void showForge() {
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