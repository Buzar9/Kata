package eight;

import java.util.HashMap;

// return new StringBuilder(str).reverse().toString();

public class ReversStrings {

    public static String solution(String str){

        HashMap<Integer, Character> list = new HashMap<>();

        char [] charaktersTable = new char [str.length()];

        for (int i = 0; i < str.length(); i++) {
            charaktersTable[i] = str.charAt(i);
            list.put(str.length() - i, charaktersTable[i]);
        }

        String result = new String();
        for (int i = 1; i < list.size()+1; i++) {
            result += list.get(i);
        }

        return result;
    }
}
