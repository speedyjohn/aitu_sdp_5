package org.example.Classes.CharacterStates;

import org.example.Interfaces.CharacterState;
import org.example.Classes.Character;

public class DefeatedState implements CharacterState {
    private Character character;

    public DefeatedState(Character character) {
        this.character = character;
    }

    @Override
    public void attack() {
        System.out.println(character.getName() + " can not attack because defeated.");
    }
}
