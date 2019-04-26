package com.jdlr.rpg;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void Given_Response1_When_askAction_Then_NormalAttack() {
        System.setIn(new ByteArrayInputStream("1\n".getBytes()));
        Game game = new Game();
        Player player1 = new Player();
        player1.charac = new Warrior(10,10,0,0, "Joueur 1");
        int choice = game.askAction(player1);
        assertEquals(1, choice);
    }
}