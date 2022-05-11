package Bootcamp.FirstExercises;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input whole number: ");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }

}
