package com.jdlr.rpg;

public class Warrior extends Character {
    public Warrior(int level, int force, int dexterity, int intelligence) {
        super(level, force, dexterity, intelligence);
    }

    @Override
    public void basicAttack(Character character) {
        character.setLife(character.getLife() - this.getForce());
    }

    /**
     * Special attack of the warrior
     * @param character the enemy
     */
    public void specialAttack(Character character) {
        character.setLife(character.getLife() - (this.getForce() * 2));
        this.setLife(this.getLife() - (this.getForce()/2));
    }
}
