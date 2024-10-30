package org.example.Classes.FirghtingStrategies;

import org.example.Interfaces.FightingStrategy;

public class MeleeStrategy implements FightingStrategy {
    @Override
    public void fight() {
        System.out.println("Fighting with melee attacks.");
    }
}
