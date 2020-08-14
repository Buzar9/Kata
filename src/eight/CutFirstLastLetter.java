package eight;

import java.util.ArrayList;

public class CutFirstLastLetter {
    public static void main(String[] args) {

//        return str.substring(1, str.length() - 1);

        ArrayList<Character> list = new ArrayList<>();
        String str = "person";

        char temp;
        for (int i = 0; i < str.length(); i++) {
            temp = str.charAt(i);
            if (i != 0 && i != str.length()-1) list.add(temp);
        }

        String result = new String();
        for (Character letter : list) {
            result += letter;
        }
    }
}
