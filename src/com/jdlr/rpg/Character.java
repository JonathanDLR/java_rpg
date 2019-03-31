package com.jdlr.rpg;

public abstract class Character {
    private int level;
    private int life;
    private int force;
    private int dexterity;
    private int intelligence;

    public Character(int level, int force, int dexterity, int intelligence) {
        this.level = level;
        this.life = level * 5;
        this.force = force;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    /**
     * Basic attack dealing
     * @param character the enemy
     */
    public abstract void basicAttack(Character character);

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
