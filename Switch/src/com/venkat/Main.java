package com.venkat;

public class Main {

    public static void main(String[] args) {
        switchInt(4);
        switchChar('X');

    }

    public static void switchInt(int value) {
        switch(value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Neither of 1 or 2 but the value actually was " + value);
                break;
            default:
                System.out.println("Neither of 1, 2 or 3");
                break;
        }
    }

    public static void switchChar(char value) {
        switch(value) {
            case 'A':
                System.out.println("Character was " + value);
                break;
            case 'B':
                System.out.println("Character was " + value);
                break;
            case 'C':
                System.out.println("Character was " + value);
                break;
            case 'D':
                System.out.println("Character was " + value);
                break;
            default:
                System.out.println("Character was neither of the required");
                break;
        }
    }
}
