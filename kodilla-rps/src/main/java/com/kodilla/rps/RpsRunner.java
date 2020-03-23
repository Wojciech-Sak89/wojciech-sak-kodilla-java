package com.kodilla.rps;

import com.kodilla.rps.logic.StartGame;

public class RpsRunner {
    public static void main(String[] args) {
        StartGame startGame = new StartGame();
        startGame.start();
    }

}