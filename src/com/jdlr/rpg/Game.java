package com.jdlr.rpg;

import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);

    /**
     * Display and create player ahd their character
     */
    public Player[] start() {
        System.out.println("Création du personnage Joueur 1");
        Player player1 = new Player();
        player1.createCharacter("Joueur 1");
        System.out.println("Création du personnage Joueur 2");
        Player player2 = new Player();
        player2.createCharacter("Joueur 2");
        System.out.println(player2.charac.getLife());
        Player[] playerArray = {player1, player2};
        return playerArray;
    }

    /**
     * Display action choice
     * @param player The player
     */
    public int askAction(Player player) {
        System.out.println(player.charac.getName() + " (" + player.charac.getLife() + " vitalité) veuillez choisir votre action" +
                " (1: attaque basique, 2: attaque spéciale)");
        int type;
        boolean responseIsGood;

        do {
            type = sc.nextInt();
            responseIsGood = (type == 1 || type == 2);

            if (!responseIsGood) {
                System.out.println("Veuillez renseigner un chiffre parmi les choix proposés");
            }
        } while (!responseIsGood);
        return type;
    }

    /**
     * resolve Action
     * @param player The player
     * @param adversary The adversary
     */
    public void resolveAction(Player player, Player adversary) {
        int type = askAction(player);
        if (type == 1) {
            player.charac.basicAttack(adversary.charac);
        } else {
            player.charac.specialAttack(adversary.charac);
        }
    }

    /**
     * start the game, display the action and check if game is over
     */
    public void inGame() {
        Player[] playerArray = this.start();
        Player player1 = playerArray[0];
        Player player2 = playerArray[1];

        do {
            this.resolveAction(player1, player2);
            player2.charac.isDead();
             if (player2.charac.getLife() > 0) {
                 this.resolveAction(player2, player1);
                 player1.charac.isDead();
             }
        } while(player1.charac.getLife() > 0 && player2.charac.getLife() > 0);
    }
}
