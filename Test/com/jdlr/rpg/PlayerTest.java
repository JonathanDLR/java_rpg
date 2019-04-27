package com.jdlr.rpg;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void Given_Response1_When_askType_Then_DisplayWarrior() {
        System.setIn(new ByteArrayInputStream("1\n".getBytes()));
        Player player1 = new Player();
        int choice = player1.askType();
        assertEquals(1, choice);
    }

    @Test
    public void Given_BadResponse_When_askSomething_Then_DisplayDexterity() {
        System.setIn(new ByteArrayInputStream("115\n10\n".getBytes()));
        Player player1 = new Player();
        int choice = player1.askSomething("Dextérité");
        assertEquals(10, choice);
    }
}