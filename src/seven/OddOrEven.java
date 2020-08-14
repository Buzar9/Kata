package seven;

public class OddOrEven {

    /*
odd_or_even([0]) returns "even"
odd_or_even([0, 1, 4]) returns "odd"
odd_or_even([0, -1, -5]) returns "even"

public static String oddOrEven (int[] array){}
     */

//    return stream(array).sum() % 2 == 0 ? "even" : "odd";

    public static void main(String[] args) {

        int[] array = {1, 2, 8};
        int sumOfArray = 0;

        for (int a : array) {
            sumOfArray += a;
        }

        String result = (sumOfArray % 2 == 1) ? "odd" : "even";
        if (array.length == 0) result = "0";

//        if (sumOfArray % 2 == 0) {
//            result = "even";
//        } else if (sumOfArray % 2 == 1) {
//            result = "odd";
//        } else {
//            result = "0";
//        }

        System.out.println(result);
    }
}
