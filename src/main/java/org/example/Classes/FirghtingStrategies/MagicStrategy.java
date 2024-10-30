package org.example.Classes.FirghtingStrategies;

import org.example.Interfaces.FightingStrategy;

public class MagicStrategy implements FightingStrategy {
    @Override
    public void fight() {
        System.out.println("Fighting with magic attacks.");
    }
}
