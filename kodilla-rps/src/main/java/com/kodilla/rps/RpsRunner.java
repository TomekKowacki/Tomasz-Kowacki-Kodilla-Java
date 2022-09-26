package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Game game = new Game();

        game.createNewPlayer();
        game.roundsToWin();

        while(!game.isEnd()) {

            if(game.getGivenRounds() == game.getWinRounds()
                    || game.getGivenRounds() == game.getLoseRounds()) {

                game.whatToDoWhenGameEnd();

            } else {

                game.playerChooseMove();
                game.computerChooseMove();
                String result = game.compareChoices();
                System.out.println("YOU --> " + game.getPlayerAttribute() + "  VS  "
                        + game.getComputerAttribute() + "  <--COM");
                System.out.println(result);
                System.out.println(game.getPlayer().getPlayerName() + " points is: " + game.getWinRounds());
                System.out.println("Computer points is: " + game.getLoseRounds());

            }
        }






    }
}
