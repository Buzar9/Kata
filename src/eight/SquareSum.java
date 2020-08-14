package eight;

/*
    public static int squareSum(int[] xs) {
    return Arrays.stream(xs).map(x -> x * x).sum();
 */

public class SquareSum {
    public static int squareSum(int[] n){

        int result = 0;
        for (int a : n) {
           result += Math.pow(a, 2);
        }

        return result;
    }
}
