package cy.olesiabokk.arrayexercices.util;

import cy.olesiabokk.arrayexercices.service.ScannerService;

public class SearchResult {
    public static void showEvenNumQuantity() {
        int[] array = ScannerService.getArray();
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                quantity++;
            }
        }
        System.out.println("Even numbers quantity: " + quantity);
    }

    public static void showOddNumQuantity() {
        int[] array = ScannerService.getArray();
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                quantity++;
            }
        }
        System.out.println("Odd numbers quantity: " + quantity);
    }

    public static void showPrimeNumQuantity() {
        int[] array = ScannerService.getArray();
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
        int[] array = ScannerService.getArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Numbers sum in the array: " + sum);
    }

    public static void showSubstraction() {
        int[] array = ScannerService.getArray();
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
        int[] array = ScannerService.getArray();
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                quantity++;
            }
        }
        System.out.println("Quantity of zero: " + quantity);
    }
}
