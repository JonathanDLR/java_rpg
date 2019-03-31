package com.jdlr.rpg;

public class Mage extends Character {
    private int baseLife;
    public Mage(int level, int force, int dexterity, int intelligence) {
        super(level, force, dexterity, intelligence);
        this.baseLife = this.getLife();
    }

    @Override
    public void basicAttack(Character character) {
        character.setLife(character.getLife() - this.getIntelligence());
    }

    /**
     * special attack of the mage
     */
    public void specialAttack() {
        if (this.getLife() + (this.getIntelligence() * 2) <= this.baseLife) {
            this.setLife(this.getLife() + (this.getIntelligence() * 2));
        } else {
            this.setLife(this.baseLife);
        }
    }

    public int getBaseLife() {
        return baseLife;
    }

    public void setBaseLife(int baseLife) {
        this.baseLife = baseLife;
    }
}
