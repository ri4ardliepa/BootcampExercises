package Bootcamp.FirstExercises;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input whole number: ");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
