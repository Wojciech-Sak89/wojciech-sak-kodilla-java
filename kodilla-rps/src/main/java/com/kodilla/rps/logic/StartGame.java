package com.kodilla.rps.logic;

import java.util.Random;
import java.util.Scanner;

public class StartGame {
    public void start() {
        Scanner s = new Scanner(System.in);
        boolean end = false;

        String name;
        int roundsToWin;
        int roundsWonPlayer = 0;
        int roundsWonCPU = 0;

        String choicePlayer;
        int choiceCPU;
        String choiceCPUtext;
        Random random = new Random();

        printInstructions();
        System.out.println("Please enter your name: ");
        name = s.nextLine();
        System.out.println("Enter number of rounds needed to win the game:");
        roundsToWin = s.nextInt();


        while(!end) {
            System.out.println("Make a choice (1, 2, 3, x, n):");
            //  choices
            choicePlayer = s.next();
            if (choicePlayer.equals("x")) { break; }
            if (choicePlayer.equals("n")) { start(); break; }

            choiceCPU = random.nextInt(3) + 1;
            choiceCPUtext = Integer.toString(choiceCPU);
            System.out.println(name + ": " + choiceName(choicePlayer) + "   ---   CPU: " + choiceName(choiceCPUtext));

            // find winner of that round
                //PLAYER WINS
            if((choicePlayer.equals("1") && choiceCPUtext.equals("3")) || (choicePlayer.equals("3") && choiceCPUtext.equals("2")) || (choicePlayer.equals("2") && choiceCPUtext.equals("1"))) {
                System.out.println(name + " wins this round!");
                roundsWonPlayer++;
            }
                // CPU WINS
            if((choicePlayer.equals("3") && choiceCPUtext.equals("1")) || (choicePlayer.equals("2") && choiceCPUtext.equals("3")) || (choicePlayer.equals("1") && choiceCPUtext.equals("2"))) {
                System.out.println("CPU wins this round!");
                roundsWonCPU++;
            }
                // DRAW
            if(choicePlayer.equals(choiceCPUtext)) {
                System.out.println("You have chosen same as CPU! (or CPU same as you...)");
                System.out.println("Current round: DRAW");
            }

            // current result
            System.out.println("Current result: " + name + ": " + roundsWonPlayer + "\tCPU: " + roundsWonCPU);

            // to end
            if (roundsWonPlayer == roundsToWin || roundsWonCPU == roundsToWin) {
                // final result
                System.out.println("Final result: " + name + ": " + roundsWonPlayer + "\tCPU: " + roundsWonCPU);
                if (roundsWonPlayer > roundsWonCPU) {
                    System.out.println(name + " wins! Congratulations!");
                } else {
                    System.out.println("CPU wins! Maybe next time " + name);
                }
                // new game / quit game
                endGame();
                end = true;
            }
        }
    }

    public void printInstructions() {
        System.out.println("ROCK PAPER SCISSORS - THE GAME\n" +
                "Hello! Here you have an opportunity to play a classic game called ROCK PAPER SCISSORS!\n" +
                "\nHOW TO PLAY?\n" +
                "After choosing number of rounds needed to win the game press:\n" +
                "1 - to play ROCK\n" +
                "2 - to play PAPER\n" +
                "3 - to play SCISSORS\n" +
                "x - to end the game\n" +
                "n - to start a new game\n" +
                "Reminder: ROCK beats SCISSORS \t SCISSORS beats PAPER \t PAPER beats ROCK" + // 1 beats 3, 3 beats 2, 2 beats 1 ELSE draw
                "\nAfter you press 1-3 CPU will respond. Don't worry, \nit doesn't know what you have chosen, like in real game! :-)\n");
    }

    public String choiceName(String choice) {
        switch (choice) {
            case "1":
                return "ROCK";
            case "2":
                return "PAPER";
            case "3":
                return "SCISSORS";
            case "n":
                return "n";
            case "x":
                return "x";

        }
        return "invalid choice";
    }

    public void endGame() {
        String finalChoice;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Press n to start new game. Press x to quit.");
            finalChoice = s.nextLine();
            if (finalChoice.equals("x")) { break; } else
            if (finalChoice.equals("n")) { start(); break; } else
            {
                System.out.println("Invalid input!");
            }
        }
    }
}
