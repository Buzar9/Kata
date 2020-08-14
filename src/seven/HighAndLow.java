package seven;

import java.util.ArrayList;

public class HighAndLow {

    public static String highAndLow(String numbers) {

        ArrayList <Integer> cleanInteger = new ArrayList<>();
        String[] temp = numbers.split(" ");

        for (String a : temp) {
            cleanInteger.add(Integer.parseInt(a));
        }

        int min = cleanInteger.get(0);
        for (int i = 0; i < cleanInteger.size(); i++) {
            if (cleanInteger.get(i) < min) {
                min = cleanInteger.get(i);
            }
        }

        int max = cleanInteger.get(0);
        for (int i = 0; i < cleanInteger.size(); i++) {
            if (max < cleanInteger.get(i)) {
                max = cleanInteger.get(i);
            }
        }

        String result = max + " " + min;

        return result;
    }

}


