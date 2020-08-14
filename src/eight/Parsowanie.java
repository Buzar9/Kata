package eight;

import java.util.ArrayList;

public class Parsowanie {
    public static void main(String[] args) {

        int g = 7050;
        int h = String.valueOf(g).length();
        int p = (int) Math.pow(10, h - 1);

        double b = g / p;

        int y = (int) (b * Math.pow(10, 3));

        String x = String.valueOf(y);



        int num = 7654;
        int numLength = String.valueOf(num).length();
        double number;
        int power;
        int locoroco;
        String f;

        power = (int) Math.pow(10, numLength - 1);

        number = num / power;

        locoroco = (int) (number * power);



        f = String.valueOf(locoroco);

        System.out.println(f);






    }
}
