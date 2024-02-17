import java.util.ArrayList;
import java.util.Arrays;

public class SmallestPrimeNumberMissing {

    private static int findPrimeUsingBooleanMarkerArray(Integer[] unsortedArr) {
        //size of marker array is arbitrarily. assume unsorted array contains a maximum of 99 prime numbers
        boolean[] markerArr = new boolean[100];

        for (Integer element : unsortedArr) {
            if(element > 0 && PrimeNumberCalc.isPrime(element))
                markerArr[element] = true;

        }
        for(int i = 2; i < markerArr.length; i++){
            //boolean isPrimeNumber = PrimeNumberCalc.isPrime(i);
            if(PrimeNumberCalc.isPrime(i) && !markerArr[i])
                //return first prime index with 'false' value
                return i;

        }
        return 0;
    }


    public static void main(String[] args) {
        ArrayList<Integer[]> listOfArrays = new ArrayList<>();

        Integer[] arr1 = {2, 3, 7, 6, 8, -1, -10, 15};
        listOfArrays.add(arr1);
        Integer[] arr2 = {2, 3, -7, 6, 8, 1, -10, 15, 2, 5};
        listOfArrays.add(arr2);
        Integer[] arr3 = {1, 1, 0, -1, -2};
        listOfArrays.add(arr3);
        Integer[] arr4 = {1, 1, 0, -1, -2, 2};
        listOfArrays.add(arr4);
        Integer[] arr5 = {1, 0, -1, 1, -2};
        listOfArrays.add(arr5);
        Integer[] arr6 = {2, 3, 7, 6, 8, -1, -10, 15, 5, 13, 11};
        listOfArrays.add(arr1);

        for (Integer[] element : listOfArrays) {
            System.out.println("Smallest prime number missing in " +
                    Arrays.toString(element) + ": " +
                    findPrimeUsingBooleanMarkerArray(element));
            System.out.println();

        }
    }
}
