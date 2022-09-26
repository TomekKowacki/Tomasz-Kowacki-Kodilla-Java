package com.kodilla.rps;

public class SystemMessages {

    public static void enterName(){
        System.out.println("Hello!\n Please enter your name:");
    }
    public static void enterRounds() {
        System.out.println("How many winnings do you want to play?");
    }
    public static void userManual() {
        System.out.println("User manual:\nPress |1| for ROCK\nPress |2| for PAPER\nPress |3| for SCISSORS" +
                "\nPress |4| for LIZARD\nPress |5| for SPOCK" +
                "\nPress |x| for END THE GAME\nPress |n| for START A NEW GAME");
    }
    public static void start(){
        System.out.println("Game starts...");
    }
    public static void choose(){
        System.out.println("choose your move:");
    }
    public static void newGameOrEndGame(){
        System.out.println("Start a new game (n)   End game (x)");
    }
    public static void newGameQuestion(){
        System.out.println("Do you want start a new game?  [y/n]");
    }
    public static void endGameQuestion(){
        System.out.println("Do you want end the game?  [y/n]");
    }
}
