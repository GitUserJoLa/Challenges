import java.util.Set;

public class TestPrimeNumberCalc {
    private static void testIsPrime() {
        System.out.println("testIsPrime");
        for (int i = 2; i < 100; i++) {
            if (PrimeNumberCalc.isPrime(i)) {
                System.out.println(i + ": true");
            }
        }
        System.out.println();
    }
    private static void testMultiplesOfN() {
        Set<Integer> setMultiples = PrimeNumberCalc.multiplesOfN(2, 10);
        System.out.println("multiples of 2 up to 10: (" + setMultiples.size() + " in total) " + setMultiples);

        setMultiples = PrimeNumberCalc.multiplesOfN(7, 10);
        System.out.println("multiples of 7 up to 10: (" + setMultiples.size() + " in total) " + setMultiples);

        setMultiples = PrimeNumberCalc.multiplesOfN(7, 100);
        System.out.println("multiples of 7 up to 100: (" + setMultiples.size() + " in total) " + setMultiples);

        setMultiples = PrimeNumberCalc.multiplesOfN(50, 100);
        System.out.println("multiples of 50 up to 100: (" + setMultiples.size() + " in total) " + setMultiples);

        setMultiples = PrimeNumberCalc.multiplesOfN(23, 1000);
        System.out.println("multiples of 23 up to 1000: (" + setMultiples.size() + " in total) " + setMultiples);

        System.out.println();
    }
    public static void main(String[] args) {
        testIsPrime();
        testMultiplesOfN();

        PrimeNumberCalc.sieveOfEratosthenes(10);
        PrimeNumberCalc.sieveOfEratosthenes(30);
        PrimeNumberCalc.sieveOfEratosthenes(100);
        PrimeNumberCalc.sieveOfEratosthenes(10000);
    }
}
