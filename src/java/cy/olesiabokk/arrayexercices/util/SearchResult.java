package cy.olesiabokk.arrayexercices.util;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchResult {
    public static void showEvenNumQuantity() {
        int[] array = ArraysCreator.getArray();
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                quantity++;
            }
        }
        System.out.println("Even numbers quantity: " + quantity);
    }

    public static void showOddNumQuantity() {
        int[] array = ArraysCreator.getArray();
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                quantity++;
            }
        }
        System.out.println("Odd numbers quantity: " + quantity);
    }

    public static void showPrimeNumQuantity() {
        int[] array = ArraysCreator.getArray();
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(Math.abs(array[i]))) {
                quantity++;
            }
        }
        System.out.println("Prime numbers quantity: " + quantity);
    }

    private static boolean isPrime(int num) {
        boolean prime = true;
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void showNumbersSum() {
        int[] array = ArraysCreator.getArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Numbers sum in the array: " + sum);
    }

    public static void showSubstraction() {
        int[] array = ArraysCreator.getArray();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + array[i];
            } else {
                oddSum = oddSum + array[i];
            }
        }
        System.out.println("Substraction result of even and odd numbers: " + Math.abs(evenSum - oddSum));
    }

    public static void zeroQuantity() {
        int[] array = ArraysCreator.getArray();
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                quantity++;
            }
        }
        System.out.println("Quantity of zero: " + quantity);
    }

    public static void bubbleSortArray() {
        int[] array = ArraysCreator.getArray();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void insertSort() {
        int[] array = ArraysCreator.getArray();
        for (int i = 0; i < array.length; i++) {
            int currElem = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > currElem) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = currElem;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort() {
        int[] array = ArraysCreator.getArray();
        for (int step = 0; step < array.length; step++) {
            int minElementIndex = findMinValue(step);
            int temp = array[step];
            array[step] = array[minElementIndex];
            array[minElementIndex] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    private static int findMinValue(int startSearch) {
        int[] array = ArraysCreator.getArray();
        int minIndex = startSearch;
        int minValue = array[startSearch];
        for (int i = startSearch + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void sortArrayList() {
        ArrayList list = ArraysCreator.createList();
        ArrayList sortedList = new ArrayList();
        while (list.size() != 0) {
            int minElemIndex = getMinListValue();
            sortedList.add(list.get(minElemIndex));
            list.remove(minElemIndex);
        }
        System.out.println("Sorted list: " + sortedList);
    }

    private static int getMinListValue() {
        ArrayList list = ArraysCreator.getArrayList();
        int minIndex = 0;
        int minValue = (int) list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if ((int) list.get(i) < minValue) {
                minValue = (int) list.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void sortArray() {
        int[] array = ArraysCreator.getArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    array[j] = array[j] + array[j - 1];
                    array[j - 1] = array[j] - array[j - 1];
                    array[j] = array[j] - array[j - 1];
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

