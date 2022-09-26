package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private PlayerData player;
    private int givenRounds;
    private int winRounds = 0;
    private int loseRounds = 0;
    private int playerMove;
    private String playerAttribute;
    private int computerMove;
    private String computerAttribute;
    private boolean end = false;


    public int getGivenRounds() {
        return givenRounds;
    }

    public int getWinRounds() {
        return winRounds;
    }

    public int getLoseRounds() {
        return loseRounds;
    }

    public void setWinRounds(int winRounds) {
        this.winRounds = winRounds;
    }

    public void setLoseRounds(int loseRounds) {
        this.loseRounds = loseRounds;
    }

    public PlayerData getPlayer(){
        return player;
    }

    public String getPlayerAttribute(){
        return playerAttribute;
    }
    public String getComputerAttribute(){
        return computerAttribute;
    }

    public boolean isEnd() {
        return end;
    }

    private Scanner scanner = new Scanner(System.in);
    void createNewPlayer() {
        SystemMessages.enterName();
        String playerName = scanner.nextLine();
        System.out.println("Hello " + playerName);
        player = new PlayerData(playerName);
    }

    void roundsToWin(){
        SystemMessages.enterRounds();
        boolean isPointsToWinInteger = false;

        while (!isPointsToWinInteger) {
            try {
                givenRounds = scanner.nextInt();
                isPointsToWinInteger = true;
            } catch (Exception e) {
                System.out.println("Invalid data. Please put integer");
                scanner.next();
            }
        }
        SystemMessages.userManual();
        SystemMessages.start();
    }

    void playerChooseMove(){
        boolean move = false;
        SystemMessages.choose();

        while(!move) {
            boolean isMoveInteger = false;
            while(!isMoveInteger) {
                try {
                    playerMove = scanner.nextInt();
                    isMoveInteger = true;
                }catch (Exception d){
                    System.out.println("Invalid data. Please put integer");
                    scanner.next();
                }
            }

            if (0 < playerMove && playerMove < 6) {
                move = true;
                if (playerMove == 1) {
                    playerAttribute = "Rock";
                } else if (playerMove == 2) {
                    playerAttribute = "Paper";
                } else if (playerMove == 3) {
                    playerAttribute = "Scissors";
                } else if (playerMove == 4) {
                    playerAttribute = "Lizard";
                } else {
                    playerAttribute = "Spock";
                }
            } else {
                System.out.println("You have to choose a number from 1 to 5");
            }
        }

    }

    void computerChooseMove(){
        Random random = new Random();
        computerMove = random.nextInt(6);

        if (computerMove == 1) {
            computerAttribute = "Rock";
        } else if (computerMove == 2) {
            computerAttribute = "Paper";
        }else if (computerMove == 3) {
            computerAttribute = "Scissors";
        }else if (computerMove == 4){
            computerAttribute = "Lizard";
        }else {
            computerAttribute = "Spock";
        }
    }

    String compareChoices(){
        String gameResult = "";
        if (playerMove == computerMove) {
            gameResult = "Draw";

        } else if (playerMove == 2 && computerMove == 1 || playerMove == 3 && computerMove == 2 ||
                    playerMove == 1 && computerMove == 3 || playerMove == 1 && computerMove == 4 ||
                    playerMove == 4 && computerMove == 5 || playerMove == 5 && computerMove == 3 ||
                    playerMove == 3 && computerMove == 4 || playerMove == 4 && computerMove == 2 ||
                    playerMove == 2 && computerMove == 5 || playerMove == 5 && computerMove == 1) {
            gameResult = "You win";
            winRounds ++;
        } else {
            gameResult = "You lose";
            loseRounds ++;
        }
        return gameResult;
    }
    void gameSummary() {
        System.out.println("\nGAME RESULT: " + getPlayer().getPlayerName() + " - " + getWinRounds() +
                "   Computer - " + getLoseRounds());
        if(winRounds == givenRounds){
            System.out.println(getPlayer().getPlayerName() + " WIN");
        }else {
            System.out.println("Computer WIN");
        }
    }
    void whatToDoWhenGameEnd(){
        boolean choice = false;
        gameSummary();
        SystemMessages.newGameOrEndGame();

        while(!choice){
            String newGameOrEndGameAnswer = scanner.next();

            if(newGameOrEndGameAnswer.equals("n")){
                SystemMessages.newGameQuestion();
                String newGameAnswer = scanner.next();
                if(newGameAnswer.equals("y")){
                    loseRounds = 0;
                    winRounds = 0;
                    roundsToWin();
                    choice = true;
                }else if(newGameAnswer.equals("n")){
                    choice = true;
                }else {
                    System.out.println("Wrong command!");
                    SystemMessages.newGameQuestion();
                    scanner.next();
                }

            }else if (newGameOrEndGameAnswer.equals("x")){
                SystemMessages.endGameQuestion();
                String endGameAnswer = scanner.next();
                if(endGameAnswer.equals("y")){
                    choice = true;
                    end = true;
                }else if(endGameAnswer.equals("n")){
                    choice = true;
                }else {
                    System.out.println("Wrong command!");
                    SystemMessages.endGameQuestion();
                    scanner.next();
                }
            }else {
                System.out.println("Wrong command... ");
                SystemMessages.newGameOrEndGame();
                scanner.next();
            }
        }


    }
}



