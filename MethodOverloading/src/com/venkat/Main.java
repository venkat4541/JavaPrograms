package com.venkat;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchestoCentimeters(6, 5);
        calcFeetAndInchestoCentimeters(-10);
//	    calculateScore("Venkat",1000);
//	    calculateScore(1000);
//	    calculateScore();
    }

    public static void calcFeetAndInchestoCentimeters(double feet, double inches) {
        if(feet >= 0 && inches >= 0 && inches <= 12) {
            double totalInches = inches + feet * 12;
            double centimeters = totalInches * 2.54;
            System.out.println("The number of centimeters in " + feet + " and " + inches + " inches is " + centimeters + " centimeters.");
        } else {
            System.out.println("Invalid values for feet or inches.");
        }
    }

    public static void calcFeetAndInchestoCentimeters(double inches) {
        if(inches >= 0) {
            int feet = (int) inches/12;
            inches = (int) inches%12;
            calcFeetAndInchestoCentimeters(feet, inches);
        } else {
            System.out.println(inches + " is an invalid parameter!");
        }
    }




    public static void calculateScore(String player, int score) {
        System.out.println(player + " has scored: " + score);
    }

    public static void calculateScore(int score) {
        System.out.println("Score is " + score);
    }

    public static void calculateScore() {
        System.out.println("No score");
    }
}
