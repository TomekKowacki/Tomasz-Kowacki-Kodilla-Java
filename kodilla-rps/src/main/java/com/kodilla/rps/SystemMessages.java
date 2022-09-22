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
                "\nPress |x| for END THE GAME\nPress |n| for START A NEW GAME");
    }
    public static void start(){
        System.out.println("Game starts...");
    }
    public static void choose(){
        System.out.println("choose your move:");
    }
}
