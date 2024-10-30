package org.example.Classes.Actions;

import java.lang.reflect.GenericDeclaration;

public abstract class GameAction {
    public final void executeAction() {
        startAction();
        performAction();
        endAction();
    }

    protected abstract void startAction();
    protected abstract void performAction();
    protected abstract void endAction();

}
