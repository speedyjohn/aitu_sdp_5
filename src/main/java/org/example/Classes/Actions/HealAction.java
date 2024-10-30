package org.example.Classes.Actions;

public class HealAction extends GameAction {
    @Override
    protected void startAction() {
        System.out.println("Preparing to heal action.");
    }
    @Override
    protected void performAction() {
        System.out.println("Performing heal action.");
    }
    @Override
    protected void endAction() {
        System.out.println("End of heal action.");
    }
}
