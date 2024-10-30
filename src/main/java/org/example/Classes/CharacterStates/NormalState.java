package org.example.Classes.CharacterStates;

import org.example.Classes.Character;
import org.example.Interfaces.CharacterState;

public class NormalState implements CharacterState {
    private Character character;

    public NormalState(Character character) {
        this.character = character;
    }

    @Override
    public void attack() {
        System.out.println(character.getName() + " just attacks.");
    }
}
