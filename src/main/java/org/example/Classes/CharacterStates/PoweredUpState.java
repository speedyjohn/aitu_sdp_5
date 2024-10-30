package org.example.Classes.CharacterStates;

import org.example.Interfaces.CharacterState;
import org.example.Classes.Character;


public class PoweredUpState implements CharacterState {
    private Character character;

    public PoweredUpState(Character character) {
        this.character = character;
    }
    @Override
    public void attack() {
        System.out.println(character.getName() + " attacks with power up.");
    }
}
