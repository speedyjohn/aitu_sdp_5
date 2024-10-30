package org.example.Classes.FirghtingStrategies;

import org.example.Interfaces.FightingStrategy;

public class RangedStrategy implements FightingStrategy {
    @Override
    public void fight() {
        System.out.println("Fighting with ranged attacks.");
    }
}
