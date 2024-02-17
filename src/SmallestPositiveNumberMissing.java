import java.util.*;

/*
 * find the smallest positive number which is missing in a given unsorted array
 */
public class SmallestPositiveNumberMissing {
    private static int findSmaPosApproach1(Integer[] arr) {
        int smallestPositive = 1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            //ignore all elements equal to or below zero
            if (arr[i] <= 0)
                continue;
            //arr is sorted. ignore current element when it equals next element (if it exists)
            if ((i + 1) < arr.length && arr[i] == arr[i + 1])
                continue;
            //if true we found our number so skip the fucking rest
            if (smallestPositive < arr[i])
                break;
            //when none of above conditions is true, increment number
            smallestPositive++;
        }
        return smallestPositive;
    }

    private static int find2ndApproach(Integer[] arr) {
        int smallestPositive = 1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0)
                continue;
            if ((i + 1) < arr.length && arr[i] == arr[i + 1])
                continue;
            if (smallestPositive == arr[i])
                smallestPositive++;
        }
        return smallestPositive;
    }

    private static int orderNApproach(Integer[] unsortedArr) {
        /*
         iterate through unsorted array
         whenever we find a positive, we mark its occurrence ('true') in a marker array
         (we can ignore numbers bigger than the unsorted array's length,
         as there is definitely a smaller number missing)

         length of marker array is bigger than unsorted array in case all numbers in unsorted array are consecutive
         the index of the marker array represents an actual positive number
         iterate through marker array
         the first element (starting with 1) that is marked false must be the smallest missing number
         */

        boolean[] markerArr = new boolean[unsortedArr.length + 1];

        for (Integer element : unsortedArr) {
            if(element > 0 && element <= unsortedArr.length){
                //mark the occurrence of positive number
                markerArr[element] = true;
            }
        }
        for(int i = 1; i < markerArr.length; i++){
            if(!markerArr[i]){
                //return first index with 'false' value
                return i;
            }
        }
        //if method fails for any obscure reason
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer[]> listOfArrays = new ArrayList<>();

        Integer[] arr1 = {2, 3, 7, 6, 8, -1, -10, 15};
        listOfArrays.add(arr1);
        Integer[] arr2 = {2, 3, -7, 6, 8, 1, -10, 15};
        listOfArrays.add(arr2);
        Integer[] arr3 = {1, 1, 0, -1, -2};
        listOfArrays.add(arr3);
        Integer[] arr4 = {1, 1, 0, -1, -2, 2};
        listOfArrays.add(arr4);
        Integer[] arr5 = {1, 0, -1, 1, -2};
        listOfArrays.add(arr5);

        for (Integer[] element : listOfArrays) {
            System.out.println("Smallest positive number missing in " +
                    Arrays.toString(element) + ": " +
                    orderNApproach(element));
        }
        System.out.println();

        for (Integer[] element : listOfArrays) {
            System.out.println("Smallest positive number missing in " +
                    Arrays.toString(element) + ": " +
                    findSmaPosApproach1(element));
        }
        System.out.println();

        for (Integer[] element : listOfArrays) {
            System.out.println("Smallest positive number missing in " +
                    Arrays.toString(element) + ": " +
                    find2ndApproach(element));
        }
        System.out.println();
    }
}
