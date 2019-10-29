package io.turntabl.maths;

import java.lang.*;

public class Numbers {

    public static void main(String[] args) {

        int num1 = 92;
        int num2 = 11;

        System.out.println("The sum is = " + Integer.sum(num1, num2));


        if (num1 < 0) {
            System.out.println("Number is negative : ");
        } else {
            System.out.println("Number is positve");
        }


        if (num1 % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is obb");
        }

        //LEAP YEAR

        int year = 2020;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }

       public static boolean isPositive(int numberTest){
            if (numberTest > 0) {
                return true;
            }
            else {
                return false;
            }
        }

/*
    public static boolean isSum(int numberTest1, int numberTest2) {
        int sum = numberTest1 + numberTest1;
    }*/
}
