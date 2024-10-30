package org.example.Classes;

import lombok.Getter;
import lombok.Setter;
import org.example.Classes.CharacterStates.NormalState;
import org.example.Classes.FirghtingStrategies.MeleeStrategy;
import org.example.Interfaces.CharacterState;
import org.example.Interfaces.FightingStrategy;

public class Character {
    @Getter
    private String name;
    @Setter
    private CharacterState state;
    @Setter
    private FightingStrategy strategy;

    public Character(String name) {
        this.name = name;
        this.state = new NormalState(this);
        this.strategy = new MeleeStrategy();
    }

    public void attack() {
        state.attack();
    }

    public void fight() {
        strategy.fight();
    }

}
