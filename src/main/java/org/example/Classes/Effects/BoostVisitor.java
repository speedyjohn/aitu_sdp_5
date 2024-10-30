package org.example.Classes.Effects;

import org.example.Classes.Character;
import org.example.Classes.CharacterStates.PoweredUpState;
import org.example.Interfaces.EffectVisitor;

public class BoostVisitor implements EffectVisitor {
    @Override
    public void applyBoost(Character character) {
        System.out.println(character.getName() + " is boosted.");
        character.setState(new PoweredUpState(character));
    }
    @Override
    public void applyDamage(Character character) {
        System.out.println(character.getName() + " is alive because of the boost.");
    }
}
