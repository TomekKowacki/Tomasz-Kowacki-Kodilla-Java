package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        boolean end = false;
        Scanner scanner = new Scanner(System.in);

        SystemMessages.enterName();
        String playerName = scanner.nextLine();
        System.out.println("Hello " +playerName);

        SystemMessages.enterRounds();
        int givenRounds = scanner.nextInt();

        PlayerData playerData = new PlayerData(playerName,givenRounds);

        SystemMessages.userManual();
        SystemMessages.start();

        while(end){
            SystemMessages.choose();

        }






    }
}
