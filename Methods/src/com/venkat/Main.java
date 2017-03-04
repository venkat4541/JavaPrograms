package com.venkat;

public class Main {

    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Venkat", position);
        position = calculateHighScorePosition(900);
        displayHighScorePosition("Polumahanti", position);
        position = calculateHighScorePosition(400);
        displayHighScorePosition("Sana", position);
        position = calculateHighScorePosition(50);
        displayHighScorePosition("Charan", position);

//        int finalScore = calculateScore(true, 800, 5, 100);
//        System.out.println(finalScore);
//        finalScore = calculateScore(false, 2000, 8, 300);
//        System.out.println(finalScore);
    }


    public static void displayHighScorePosition(String player, int pos) {
        System.out.println(player + " managed to get into position " + pos + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if(score > 1000) {
            return 1;
        } else if(score > 500 && score <= 1000) {
            return 2;
        } else if(score > 100 && score <= 500) {
            return 3;
        } else {
            return 4;
        }
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return 0;
    }
}
