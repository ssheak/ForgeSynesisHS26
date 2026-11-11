package org.jabref.gui.sidepane;

import org.jabref.gui.actions.SimpleCommand;

public class ForgeSynesisSidePaneComponent extends SidePaneComponent{
    public ForgeSynesisSidePaneComponent(SimpleCommand closeCommand,
                                         SimpleCommand moveUpCommand,
                                         SimpleCommand moveDownCommand,
                                         SidePaneContentFactory contentFactory) {
        super(SidePaneType.FORGE_SYNESIS,
                closeCommand,
                moveUpCommand,
                moveDownCommand,
                contentFactory
        );
    }
}
