package org.example;


import org.example.Classes.Actions.AttackAction;
import org.example.Classes.Actions.DefendAction;
import org.example.Classes.Actions.GameAction;
import org.example.Classes.Actions.HealAction;
import org.example.Classes.Character;
import org.example.Classes.CharacterStates.PoweredUpState;
import org.example.Classes.Effects.BoostVisitor;
import org.example.Classes.Effects.DamageVisitor;
import org.example.Classes.FirghtingStrategies.MagicStrategy;
import org.example.Interfaces.EffectVisitor;

public class Main {
    public static void main(String[] args) {
        Character hero = new Character("Hero");

        hero.attack();
        hero.fight();
        System.out.println();

        hero.setState(new PoweredUpState(hero));
        hero.setStrategy(new MagicStrategy());
        hero.attack();
        hero.fight();
        System.out.println();

        GameAction attack = new AttackAction();
        GameAction defend = new DefendAction();
        GameAction heal = new HealAction();
        attack.executeAction();
        defend.executeAction();
        heal.executeAction();
        System.out.println();


        EffectVisitor boostVisitor = new BoostVisitor();
        EffectVisitor damageVisitor = new DamageVisitor();

        hero.acceptEffect(boostVisitor);
        hero.attack();
        System.out.println();

        hero.acceptEffect(damageVisitor);
        hero.attack();
    }
}