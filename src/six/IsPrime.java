package six;
import java.util.Arrays;

public class IsPrime {

    public boolean oneByOne(int n) {
        if(n%2==0) {
//            System.out.println("n%2 " +n%2);
            System.out.println("false");
            return false;
        }

        for(int i=3;i*i<=n;i+=2) {
//            System.out.println("i " + i);
//            System.out.println("i*i " + i*i);
//            System.out.println("n " + n);
//            System.out.println("n%i " + n%i);
//            System.out.println("");
            if(n%i==0) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }


    boolean[] primes=new boolean[500000];
    public void fillSieve() {

        Arrays.fill(primes,true);

        primes[0]=false;
        primes[1]=false;

        for (int i=2;i<primes.length;i++) {
            if(primes[i]) {
                for (int j=2;i*j<primes.length;j++) {
                    primes[i*j]=false;
                }
            }
        }
    }

    public boolean bySieve(int n) {
        System.out.println(primes[n]);
        return primes[n];
    }
}
