package com.jdlr.rpg;

import java.util.Scanner;

public abstract class Character {
    private int level;
    private int life;
    private int strength;
    private int dexterity;
    private int intelligence;
    private String name;


    public Character(int level, int strength, int dexterity, int intelligence, String name) {
        this.level = level;
        this.life = level * 5;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.name = name;
    }

    /**
     * Basic attack dealing
     * @param character the enemy
     */
    public abstract void basicAttack(Character character);

    /**
     * Special attack dealing
     * @param character the character
     */
    public abstract void specialAttack(Character character);

    /**
     * check if character is dead
     */
    public void isDead() {
        if (this.getLife() <= 0) {
            System.out.println(this.getName() + " est mort!");
            System.out.println(this.getName() + " a perdu!");
        }
    }


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

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
