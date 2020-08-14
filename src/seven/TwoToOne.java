package seven;

import java.util.ArrayList;
import java.util.Arrays;

/*
        return (s1 + s2).chars().distinct().mapToObj(c -> String.valueOf((char)c)).sorted().collect(Collectors.joining());
 */

public class TwoToOne {

    public static String longest (String s1, String s2) {

        ArrayList<Character> singleCharList = new ArrayList<>();

        String wholeString = s1 + s2;

        char [] charaktersTable = new char [wholeString.length()];

        for (int i = 0; i < wholeString.length(); i++) {
            charaktersTable[i] = wholeString.charAt(i);
        }

        Arrays.sort(charaktersTable);

        for (Character a : charaktersTable) {
            if (!singleCharList.contains(a)) singleCharList.add(a);
        }

        String sortedString = new String();
        for (char letter : singleCharList) {
            sortedString += letter;
        }

        return sortedString;
    }

}
