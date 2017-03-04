package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        String myString = "Hello, this is a string";
        System.out.println("myString has a value of: "+myString);
        myString += ". Adding more to the string.";
        System.out.println("After adding some more content to my string: "+myString);

        String newString = "3456";
        String anotherString = "7890";
        System.out.println(newString + anotherString);

        String str = "500";
        int num = 300;
        System.out.println(str+num);

    }
}
