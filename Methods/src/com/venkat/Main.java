package com.venkat;

public class Main {

    public static void main(String[] args) {

        int finalScore = calculateScore(true, 800, 5, 100);
        System.out.println(finalScore);
        finalScore = calculateScore(false, 2000, 8, 300);
        System.out.println(finalScore);
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
