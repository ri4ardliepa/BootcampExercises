package Bootcamp.FirstExercises;

import java.util.Scanner;

public class TwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scan.nextInt();

        System.out.println("Enter second number: ");
        int b = scan.nextInt();

        System.out.println(a == b);
        boolean isEqual = a == b;

        System.out.println(a < b);
        boolean isLess = a < b;

        System.out.println(a <= b);
        boolean isLessOrEqual = a <= b;

        System.out.println(a > b);
        boolean isMore = a > b;

        System.out.println(a >= b);
        boolean isMoreOrEqual = a >= b;
    }
}
