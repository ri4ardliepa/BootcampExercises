package Bootcamp.FirstExercises;

import java.util.Scanner;


public class TwoWholeNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scan.nextInt();

        System.out.println("Enter second number: ");
        int b = scan.nextInt();

        if (a == b){
            System.out.println("True");
        }
        else if (a < 0 || b > 0){
            System.out.println("True");
        }
        else if (a > 100 || b > 100){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }


    }


}
