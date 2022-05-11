package Bootcamp.FirstExercises;

public class DeclareArray {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40};
        int a_length = array.length;

        int[] array_copy = new int[a_length];

        for(int i = 0; i < a_length; i++){
            array_copy[i] = array[i];
        }
        for(int i : array){
            System.out.print(i + ", ");
        }
        System.out.println();

        for(int i : array_copy){
            System.out.print(i + ", ");
        }

    }

}
