package com.kodilla.rps;

import java.util.Scanner;

public class PlayerData {

    private final String playerName;
    private int givenRounds;
    private int winRounds = 0;
    private int loseRounds = 0;

    public PlayerData(String playerName, int givenRounds) {
        this.playerName = playerName;
        this.givenRounds = givenRounds;
    }

    public String getPlayerName() {
        return playerName;
    }

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

}
