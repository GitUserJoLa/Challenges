/*
Task
Sum all the numbers of a given array (cq. list), except the highest and the lowest element
(by value, not by index!).
The highest or lowest element respectively is a single element at each edge,
even if there are more than one with the same value.
Mind the input validation.

Example
{ 6, 2, 1, 8, 10 } => 16
{ 1, 1, 11, 2, 3 } => 6

Input validation
If an empty value ( null, None, Nothing etc. ) is given instead of an array,
or the given array is an empty list or a list with only 1 element, return 0.
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumWithoutHighestAndLowestNumber {

    private static int sumNumbersInArray(Integer[] numbers) {
        int sum = 0;
        //input validation
        if (numbers != null && numbers.length > 1) {
            //time complexity O(n log n)
            Arrays.sort(numbers);
            //ignore first and last element
            for (int i = 1; i < numbers.length - 1; i++)
                sum += numbers[i];
        }
        //if input is invalid return value==0
        return sum;
    }

    private static int sumNumbersInList(List<Integer> numbers){
        int sum = 0;
        if (numbers != null && numbers.size() > 1) {
            //time complexity O(n log n)
            Collections.sort(numbers);
            for (int i = 1; i < numbers.size() - 1; i++)
                sum += numbers.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Print sum of array:");
        Integer[] array1 = { 6, 2, 1, 8, 10 };
        System.out.println(sumNumbersInArray(array1));

        Integer[] array2 = { 1, 1, 11, 2, 3 };
        System.out.println(sumNumbersInArray(array2));

        Integer[] arrayNull = null;
        System.out.println(sumNumbersInArray(arrayNull));

        Integer[] arrayEmpty = {};
        System.out.println(sumNumbersInArray(arrayEmpty));

        Integer[] arrayOneItem = {2};
        System.out.println(sumNumbersInArray(arrayOneItem));

        Integer[] arrayTwoItems = {2,3};
        System.out.println(sumNumbersInArray(arrayTwoItems));


        System.out.println("\nPrint sum of list:");

        List<Integer> list1 = Arrays.asList(array1);
        System.out.println(sumNumbersInList(list1));

        List<Integer> list2 = Arrays.asList(array2);
        System.out.println(sumNumbersInList(list2));

        List<Integer> listNull = null; //Arrays.asList(arrayNull); creates NullPointerException
        System.out.println(sumNumbersInList(listNull));

        List<Integer> listEmpty = Arrays.asList(arrayEmpty);
        System.out.println(sumNumbersInList(listEmpty));

        List<Integer> listOneItem = Arrays.asList(arrayOneItem);
        System.out.println(sumNumbersInList(listOneItem));

        List<Integer> listTwoItems = Arrays.asList(arrayTwoItems);
        System.out.println(sumNumbersInList(listTwoItems));


    }
}
