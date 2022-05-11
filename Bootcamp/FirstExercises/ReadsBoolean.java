package Bootcamp.FirstExercises;

import java.util.Scanner;

public class ReadsBoolean {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a true or false statement: ");
        boolean a = scan.nextBoolean();

        if(a == true){
            System.out.println("False");
        }
        if(a == false){
            System.out.println("True");
        }

        }
    }


