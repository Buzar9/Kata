package seven;

/*
public static String removeDuplicateWords(String s)

String s = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"
 */

import java.util.ArrayList;


// return stream(s.split(" ")).distinct().collect(joining(" "));


public class RemoveDuplicateWords {

    public static String activation(String s) {

//        return stream(s.split(" ")).distinct().collect(joining(" "));

        ArrayList<String> list = new ArrayList<>();

        String[] trimString = s.split(" ");

        for (String a : trimString) {
            if (!list.contains(a)) list.add(a);
        }

        String result = new String();
        for (String letter : list) {
            result += letter + " ";
        }

        result = result.trim();

        return result;

    }
}
