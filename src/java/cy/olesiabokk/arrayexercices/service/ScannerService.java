package cy.olesiabokk.arrayexercices.service;

import java.util.Scanner;

public class ScannerService {
    private static int[] array;

    public int[] inputReader() {
        System.out.println("Enter array length");
        Scanner sc = new Scanner(System.in);
        array = new int[sc.nextInt()];
        System.out.println("Fill in the array with numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int[] getArray() {
        return array;
    }
}
