package Bootcamp.ThirdExercise.Color;

import java.util.ArrayList;
import java.util.List;

public class Color {

    public static void main(String[] args) {

        String[] array = {"Red", "Green", "Yellow", "Black", "White", "Purple", "Blue"};

        ArrayList<String> color = new ArrayList<>();

        color.add("Red");
        color.add("Green");
        color.add("Yellow");
        color.add("Black");
        color.add("White");
        color.add("Purple");
        color.add("Blue");
        color.remove(3);
        color.add(0,"Pink");
        color.add(7,"Brown");


        for (String c : color){
            System.out.println(c);
        }

        System.out.println();

        List<String> colorSublist = new ArrayList<String>(color.subList(2, 5));
        color.addAll(colorSublist);

        for (String c2 : colorSublist){
            System.out.println(c2);
        }

    }

}
