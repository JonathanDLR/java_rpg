package com.jdlr.rpg;

public class Warrior extends Character {
    public Warrior(int level, int strength, int dexterity, int intelligence, String name) {
        super(level, strength, dexterity, intelligence, name);
    }

    @Override
    public void basicAttack(Character character) {
        System.out.println(this.getName() + " utilise coup d'épée et inflige " + this.getStrength() + " dommages.");
        System.out.println(character.getName() + " perd " + this.getStrength() + " de vie.");
        character.setLife(character.getLife() - this.getStrength());
    }

    @Override
    public void specialAttack(Character character) {
        System.out.println(this.getName() + " utilise coup de rage et inflige " + this.getStrength()  * 2 + " dommages.");
        System.out.println(character.getName() + " perd " + this.getStrength() * 2 + " de vie.");
        System.out.println(character.getName() + " perd " + this.getStrength() / 2 + " de vie.");
        character.setLife(character.getLife() - (this.getStrength() * 2));
        this.setLife(this.getLife() - (this.getStrength()/2));
    }
}
