package org.example.Classes.Effects;

import org.example.Classes.Character;
import org.example.Classes.CharacterStates.DefeatedState;
import org.example.Interfaces.EffectVisitor;

public class DamageVisitor implements EffectVisitor {
    @Override
    public void applyBoost(Character character) {
        System.out.println(character.getName() + " is weak and not boosted.");
    }
    @Override
    public void applyDamage(Character character) {
        System.out.println(character.getName() + " is defeated.");
        character.setState(new DefeatedState(character));
    }
}
