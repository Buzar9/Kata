package six;

import java.util.ArrayList;

/*
String outs = "";
        for (int i = 10; i < num; i *= 10) {
            int rem = num % i;
            outs = (rem > 0) ? " + " + rem + outs : outs;
            num -= rem;
        }
        outs = num + outs;

        return outs;
    }
 */

public class ExpandedForm {
    public static String expandedForm(int num) {

        String outs = "";
        for (int i = 10; i < num; i *= 10) {
            int rem = num % i;
            outs = (rem > 0) ? " + " + rem + outs : outs;
            num -= rem;
        }
        outs = num + outs;

        return outs;
    }

//        int numLength = String.valueOf(num).length();
//        int number;
//        double notation;
//        int value;
//        String b;
//
//        ArrayList<String> list = new ArrayList<>();
//        String result = new String();
//
//        for (int i = 1; i < numLength + 1; i++) {
//            notation = Math.pow(10, numLength - i);
//            number = (int) (num / notation);
//            num -= number * notation;
//            if (number == 0) continue;
//            value = (int) (number * notation);
//            b = String.valueOf(value);
//            list.add(b);
//            number = 0;
//        }
//
//        for (String a : list) {
//            result += a + " + ";
//        }
//
//
//        result = result.substring(0, result.length() - 3);
//
//        return result;
//    }
}
