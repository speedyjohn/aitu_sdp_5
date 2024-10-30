package org.example.Interfaces;

import org.example.Classes.Character;

public interface EffectVisitor {
    void applyBoost(Character character);
    void applyDamage(Character character);
}
