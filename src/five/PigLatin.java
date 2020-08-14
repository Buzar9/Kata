package five;

/*
Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !

 */

//return str.replaceAll("(\\w)(\\w*)", "$2$1ay");

import java.util.ArrayList;
import java.util.HashMap;

public class PigLatin {

    public static String pigIt(String str) {

        ArrayList<String> wordsList = new ArrayList<>();
        String[] wordsTable = str.split(" ");

        for (String single : wordsTable) {
            wordsList.add(getChangeWord(single));
        }

        String result = new String();
        for (int i = 0; i < wordsList.size(); i++) {
            result += wordsList.get(i);
        }

        result = result.trim();

        return result;
    }

    private static String getChangeWord(String word) {
        HashMap<Integer, Character> list = new HashMap<>();

        char [] charaktersTable = new char [word.length()];

        for (int i = 0; i < word.length(); i++) {
            charaktersTable[i] = word.charAt(i);
            if (i == 0) {
                list.put(word.length() - 1, charaktersTable[i]);
            } else {
                list.put(i - 1, charaktersTable[i]);
            }
        }

        String result = new String();
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }

        if (!word.equals("?") && !word.equals("!") && !word.equals(",") && !word.equals(",")) result += "ay ";

        return result;
    }
}
