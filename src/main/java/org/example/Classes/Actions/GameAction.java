package org.example.Classes.Actions;

import java.lang.reflect.GenericDeclaration;

public abstract class GameAction {
    public final void executeAction() {
        startAction();
        performAction();
        endAction();
    }

    protected void startAction() {
        System.out.println("Preparing to the action.");
    };
    protected abstract void performAction();
    protected void endAction() {
        System.out.println("Action is finished.");
    };


}
