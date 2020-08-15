package six;

/*The prime number sequence starts with: 2,3,5,7,11,13,17,19.... Notice that 2 is in position one.
3 occupies position two, which is a prime-numbered position. Similarly, 5, 11 and 17 also occupy prime-numbered positions. We shall call primes such as 3,5,11,17 dominant primes because they occupy prime-numbered positions in the prime number sequence. Let's call this listA.
As you can see from listA, for the prime range range(0,10), there are only two dominant primes (3 and 5) and the sum of these primes is: 3 + 5 = 8.
Similarly, as shown in listA, in the range (6,20), the dominant primes in this range are 11 and 17, with a sum of 28.
Given a range (a,b), what is the sum of dominant primes within that range? Note that a <= range <= b and b will not exceed 500000.
Good luck!
 */

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
