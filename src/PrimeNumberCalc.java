import org.jetbrains.annotations.NotNull;

import java.util.*;

public class PrimeNumberCalc {
    private PrimeNumberCalc() {
    }

    public static boolean isPrime(Integer potPrime) {
        //Time complexity: O(sqrt(n))
        for (int i = 2; i * i <= potPrime; i++)
            if (potPrime % i == 0)
                return false;
        return true;
    }

    public static @NotNull Set<Integer> multiplesOfN(int n, int limit) {
        Set<Integer> multiples = new TreeSet<>();
        //ignore 0*n, 1*n as we need multiples > n
        for (int i = 2; i * n <= limit; i++) {
            multiples.add(i * n);
        }
        //if i has no multiples up to limit list will be empty
        return multiples;
    }

    public static @NotNull Set<Integer> sieveOfEratosthenes(Integer limit) {
        //O(n^2)
        @NotNull Set<Integer> primesToN = new HashSet<>();

        for (int i = 2; i <= limit; i++) {
            //create a list containing all numbers up to limit
            //all entries are potential prime at the beginning
            primesToN.add(i);
        }

        for (int i = 2; i <= limit / 2; i++) {
            //2 is the first prime
            //if  i > limit/2 i can't have any multiple within the limit

            //check if i exists in the list
            if (primesToN.contains(i)) {
                //if i is still in the list, compute all multiples of i up to limit
                Set<Integer> multiples = multiplesOfN(i, limit);
                primesToN.removeAll(multiples);
            }
        }
        System.out.println("primes to " + limit + ": " + primesToN);

        return primesToN;
        /*
        for (Integer element : primesToN) {
            //compute all multiples of the current number
            //and remove them from list
            Set<Integer> multiples = multiplesOfN(element, limit);
            primesToN.removeAll(multiples);
        }
        throws ConcurrentModificationException (extends RuntimeException)

        if a thread modifies a collection directly while it is
        iterating over the collection with a fail-fast iterator,
        the iterator will throw this exception
         */
    }

    //uncompleted
    public static @NotNull ArrayList<Integer> sieveOfAtkins(Integer number) {
        /*
         * Use 'Sieve of Atkin' algorithm
         *
         * In mathematics, the sieve of Atkin is a modern algorithm
         * for finding all prime numbers  up to a specified integer.
         * Compared with the ancient sieve of Eratosthenes, which marks off multiples of primes,
         * the sieve of Atkin does some preliminary work and then
         * marks off multiples of squares of primes,
         * thus achieving a better theoretical asymptotic complexity.
         */

        ArrayList<Integer> primesToNList = new ArrayList<>();
        primesToNList.add(2);
        primesToNList.add(3);
        primesToNList.add(5);

        HashMap<Integer, Boolean> sieveList = new HashMap();

        for (int i = 2; i <= number; i++) {
            //all entries are marked non-prime
            sieveList.put(i, false);
        }
        sieveList.forEach((key, value) -> System.out.println(key + " " + value));
        return primesToNList;
    }
}
