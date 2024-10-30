package org.example.Classes.Actions;

public class AttackAction extends GameAction {
    @Override
    protected void startAction() {
        System.out.println("Preparing to attack action.");
    }
    @Override
    protected void performAction() {
        System.out.println("Performing attack action.");
    }
    @Override
    protected void endAction() {
        System.out.println("End of attack action.");
    }
}
