package seven;

/*
wykrywanie samoglosek
 */

import java.util.ArrayList;

public class IsVowel {
    public static boolean isVowel(String s) {

        return s.matches("\\A[aeiouAEIOU]\\z");

//        s = s.toLowerCase().trim();
//        ArrayList<Character> list = new ArrayList<>();
//
//        boolean result;
//        String vowels = "aeiou";
//
//        for (int i = 0; i < s.length(); i++) {
//            list.add(s.charAt(i));
//        }
//
//        System.out.println(list.toString());
//
//        int i = 0;
//        for (char a : list) {
//            if (vowels.contains(list.get(i).toString())) {
//                list.set(i, '1');
//            } else {
//                list.set(i, '0');
//            }
//        i++;
//        }
//
//        if (list.contains('0') && list.contains("\n")) {
//            result = false;
//        } else if (list.contains('1')){
//            result = true;
//        } else {
//            result = false;
//        }
//
//        return result;
    }
}
