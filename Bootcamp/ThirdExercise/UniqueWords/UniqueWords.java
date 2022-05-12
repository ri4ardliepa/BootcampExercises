package Bootcamp.ThirdExercise.UniqueWords;

import java.util.Locale;
import java.util.Set;
import java.util.HashSet;


public class UniqueWords{

    public static void main(String[] args) {

        String[] words = Text.TEXT.split("\\s+");
        Set<String> uniqueWords = new HashSet<>();

        for (String word:words){
            uniqueWords.add(word.toLowerCase(Locale.ROOT));

        }

        int uniqueWordsCount = uniqueWords.size();
        System.out.println("Value of unique words is: " + uniqueWords);


        for (String word:uniqueWords){
            System.out.println(word + " ");
        }
    }

}
