package sample;

import java.util.ArrayList;

public class Player {
    protected int money;
    protected ArrayList<Card> hand;
    protected int betMoney;
    protected boolean playerTurn;
    protected int score;
    protected int betScore;

    public Player() {
        initPlayer();
    }

    public void initPlayer() {
        this.money = 100;
        this.betMoney = 0;
        this.playerTurn = false;
        this.score = 0;
        this.betScore = 0;
        this.hand = new ArrayList<Card>();
    }

    public int getMoney() {
        return this.money;
    }

    public boolean isPlayerTurn() {
        return this.playerTurn;
    }

    public int getScore() {
        return this.score;
    }

    public int getBetMoney() {
        return this.betMoney;
    }

    public void plusScore(int amount) {
        this.score += amount;
    }

    public void bet(int amount) {
        this.betMoney += amount;
        this.money -= amount;
    }

    public int getBetScore() {
        return this.betScore;
    }

    public void setBetScore(int amount) {
        this.betScore = amount;
    }
}