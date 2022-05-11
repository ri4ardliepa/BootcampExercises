package Bootcamp.FirstExercises;

import java.util.Scanner;

public class EnterTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input first boolean value: ");
        boolean bol1 = scan.nextBoolean();

        System.out.println("Input second boolean value: ");
        boolean bol2 = scan.nextBoolean();

        if (bol1 == bol2){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
}
