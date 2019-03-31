package com.jdlr.rpg;

public class Rogue extends Character {
    public Rogue(int level, int force, int dexterity, int intelligence) {
        super(level, force, dexterity, intelligence);
    }

    @Override
    public void basicAttack(Character character) {
        character.setLife(character.getLife() - this.getDexterity());
    }

    /**
     * specialAttack of the rogue
     */
    public void specialAttack() {
        this.setDexterity(this.getDexterity() + (this.getLevel() / 2));
    }
}
