package com.jdlr.rpg;

public class Rogue extends Character {
    public Rogue(int level, int strength, int dexterity, int intelligence, String name) {
        super(level, strength, dexterity, intelligence, name);
    }

    @Override
    public void basicAttack(Character character) {
        System.out.println(this.getName() + " utilise tir à l'arc et inflige " + this.getDexterity() + " dommages.");
        System.out.println(character.getName() + " perd " + this.getDexterity() + " de vie.");
        character.setLife(character.getLife() - this.getDexterity());
    }

    @Override
    public void specialAttack(Character character) {
        System.out.println(this.getName() + " utilise concentration et gagne " + this.getLevel() / 2 + " de dextérité.");
        this.setDexterity(this.getDexterity() + (this.getLevel() / 2));
    }
}
