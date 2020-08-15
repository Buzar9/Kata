package seven;

/*
This time no story, no theory. The examples below show you how to write function accum:

Examples:

accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Mumbling {

    public static String accum(String s) {

        HashMap<Integer, Character> order = new HashMap<>();
        s = s.toLowerCase();
        for (int i = 1; i <= s.length(); i++) {
            char temporary = s.charAt(i-1);
            order.put(i, temporary);
        }

        ArrayList list = new ArrayList<>();
        for (int i = 1; i <= order.size(); i++) {
            String string = new String();
            for (int j = 1; j <= i; j++) {
                if (j==1) {
                    string = Character.toString(order.get(i)).toUpperCase();
                    continue;
                }
                string += Character.toString(order.get(i));
            }
            list.add(string);
        }

        String result = new String();
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1) {
                result += list.get(i);
                continue;
            }
            result += list.get(i) + "-";
        }

        return result;
    }

    public void listAccum(String s) {
        System.out.println(accum(s));
    }
}
