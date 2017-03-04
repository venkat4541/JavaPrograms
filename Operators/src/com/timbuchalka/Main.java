package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int result = num1 + num2 + num3;

        System.out.println("Adding numbers: 10+20+30 = "+result);

        result = num1 * num2 * num3;
        System.out.println("Multiplying the numbers: 10*20*30 = "+ result);

        result = num3 - num2 - num1;
        System.out.println("Subtracting numbers: 30-20-10 =  "+ result);

        result = num3 / num1;
        System.out.println("Dividing some numbers: 30/10 = "+result);

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
        }

        double num = 20;
        double second_num = 80;
        double res = (num + second_num) * 25;
        res %= 40;

        if(res <= 20) {
            System.out.println("Total was over the limit");
        }

    }
}
