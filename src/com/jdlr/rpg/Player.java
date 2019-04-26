package com.jdlr.rpg;

import java.util.Scanner;

public class Player {
    Scanner sc = new Scanner(System.in);
    Character charac;

    /**
     * Display character type and saving choice
     * @return type of character
     */
    public int askType() {
        System.out.println("Veuillez choisir la classe de votre personnage (1: Guerrier, 2: Rodeur, 3: Mage)");
        int type;
        boolean responseIsGood;

        do {
            type = sc.nextInt();
            responseIsGood = (type == 1 || type == 2 || type == 3);

            if (!responseIsGood) {
                System.out.println("Veuillez renseigner un chiffre parmi les choix proposés");
            }
        } while (!responseIsGood);
        return type;
    }

    /**
     * Display attribute and saving value
     * @param attribute the attribute
     * @return value of the attribute
     */
    public int askSomething(String attribute) {
        System.out.println(attribute + " du personnage");
        int nbRep;
        nbRep = sc.nextInt();
        return nbRep;
    }

    /**
     * Display character level and saving choice
     * @return level of character
     */
    public int askLevel() {
        int level = askSomething("Niveau");
        return level;
    }

    /**
     * Display character strength and saving choice
     * @return strength of character
     */
    public int askStrength() {
        int strength = askSomething("Force");
        return strength;
    }

    /**
     * Display character dexterity and saving choice
     * @return dexterity of character
     */
    public int askDexterity() {
        int dexterity = askSomething("Dextérité");
        return dexterity;
    }

    /**
     * Display character intelligence and saving choice
     * @return intelligence of character
     */
    public int askIntelligence() {
        int intelligence = askSomething("Dextérité");
        return intelligence;
    }

    /**
     * Create character of the player
     */
    public void createCharacter(String name) {
        int type;
        int level;
        int strength;
        int dexterity;
        int intelligence;
        boolean responseIsGood;

        do {
            type = askType();
            level = askSomething("Niveau");
            strength = askSomething("Force");
            dexterity = askSomething("Dextérité");
            intelligence = askSomething("Intelligence");

            responseIsGood = (level >= (strength + dexterity + intelligence));

            if(responseIsGood) {
                switch (type) {
                    case 1:
                        this.charac = new Warrior(level, strength, dexterity, intelligence, name);
                        System.out.println("Woarg je suis le guerrier " + name + " niveau " + level + ". Je possède " +
                                this.charac.getLife() + " de vitalité, " + strength + " de force, " + dexterity +
                                " de dextérité et " + intelligence + " d'intelligence!");
                        break;
                    case 2:
                        this.charac = new Rogue(level, strength, dexterity, intelligence, name);
                        System.out.println("Silence je suis le rodeur " + name+ " niveau " + level + ". Je possède " +
                                this.charac.getLife() + " de vitalité, " + strength + " de force, " + dexterity +
                                " de dextérité et " + intelligence + " d'intelligence!");
                        break;
                    case 3:
                        this.charac = new Mage(level, strength, dexterity, intelligence, name);
                        System.out.println("Abracadabra je suis le mage " + name + " niveau " + level + ". Je possède " +
                                this.charac.getLife() + " de vitalité, " + strength + " de force, " + dexterity +
                                " de dextérité et " + intelligence + " d'intelligence!");
                        break;
                }
            } else {
                System.out.println("Le niveau de votre personnage ne doit pas être supérieur à l'addition de sa force, " +
                        "sa dexterité et son intelligence.");
            }
        } while(!responseIsGood);
    }
}
