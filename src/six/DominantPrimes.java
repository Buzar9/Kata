package six;
import java.util.Arrays;
import java.util.HashMap;

public class DominantPrimes {

    public static int solve(int a, int b) {

        HashMap<Integer, Integer> primesMap = new HashMap();
        boolean[] primes = new boolean[b];
        Arrays.fill(primes, true);

        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                for (int y = 2; i * y < primes.length; y++) {
                    primes[i * y] = false;
                }
            }
        }

        int j = 0;
        int k = 0;
        for (boolean u : primes) {
            if (primes[k]) {
                j += 1;
                primesMap.put(j, k);
            }
            k++;
        }

        HashMap<Integer, Integer> dominantPrimes = new HashMap<>();
        HashMap<Integer, Integer> rangePrimes = new HashMap<>();

        for (int n = 1; n <= primesMap.size(); n++) {
            if (primesMap.get(primesMap.get(n)) == null) break;
            dominantPrimes.put(n, primesMap.get(primesMap.get(n)));
        }

        int l = 1;
        for (int m = 1; m <= dominantPrimes.size(); m++) {
            if (a > dominantPrimes.get(m)) continue;
            rangePrimes.put(l, dominantPrimes.get(m));
            l++;
        }

        Integer result = 0;

        for (int p = 1; p <= rangePrimes.size(); p++) {
            result += rangePrimes.get(p);
        }
        return result;
    }

        public void listSolve ( int minRange, int maxRange){
            System.out.println(solve(minRange, maxRange));
        }
    }
