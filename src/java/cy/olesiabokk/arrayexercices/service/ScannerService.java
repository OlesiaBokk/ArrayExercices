package cy.olesiabokk.arrayexercices.service;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerService {
    private static int[] array;
    private static ArrayList arrayList;

    public static int scanInput(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        return a;
    }

    public static int[] createArray() {
        System.out.println("Enter array length");
        array = new int[scanInput()];
        System.out.println("Fill in the array with numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanInput();
        }
        return array;
    }

    public static ArrayList createList() {
        System.out.println("Enter array length");
        int listSize = ScannerService.scanInput();
        arrayList = new ArrayList();
        System.out.println("Fill in the array with numbers");
        for (int i = 0; i < listSize; i++) {
            arrayList.add(ScannerService.scanInput());
        }
        return arrayList;
    }

    public static int[] getArray() {
        return array;
    }

    public static ArrayList getArrayList() {
        return arrayList;
    }
}
