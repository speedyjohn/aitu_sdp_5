package org.example.Classes.Actions;

public class DefendAction extends GameAction {
    @Override
    protected void startAction() {
        System.out.println("Preparing to defend action.");
    }
    @Override
    protected void performAction() {
        System.out.println("Performing defend action.");
    }
    @Override
    protected void endAction() {
        System.out.println("End of defend action.");
    }
}
