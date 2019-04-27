package com.jdlr.rpg;

public class Mage extends Character {
    private int baseLife;
    public Mage(int level, int strength, int dexterity, int intelligence, String name) {
        super(level, strength, dexterity, intelligence, name);
        this.baseLife = this.getLife();
    }

    @Override
    public void basicAttack(Character character) {
        System.out.println(this.getName() + " utilise boule de feu et inflige " + this.getIntelligence() + " dommages.");
        System.out.println(character.getName() + " perd " + this.getIntelligence() + " de vie.");
        character.setLife(character.getLife() - this.getIntelligence());
    }

    @Override
    public void specialAttack(Character character) {
        if (this.getLife() + (this.getIntelligence() * 2) <= this.baseLife) {
            System.out.println(this.getName() + " utilise soin et récupère " + this.getIntelligence() * 2 + " de vie.");
            this.setLife(this.getLife() + (this.getIntelligence() * 2));
        } else {
            int difLife = this.baseLife - this.getLife();
            System.out.println(this.getName() + " utilise soin et récupère " + difLife + " de vie.");
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
