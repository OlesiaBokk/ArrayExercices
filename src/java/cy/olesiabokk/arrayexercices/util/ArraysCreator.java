package cy.olesiabokk.arrayexercices.util;

import cy.olesiabokk.arrayexercices.service.ScannerService;

import java.util.ArrayList;

public class ArraysCreator {
    private static int[] array;
    private static ArrayList arrayList;

    public static int[] getArray() {
        return array;
    }

    public static ArrayList getArrayList() {
        return arrayList;
    }

    public static int[] createArray() {
        System.out.println("Enter array length");
        array = new int[ScannerService.scanInput()];
        System.out.println("Fill in the array with numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = ScannerService.scanInput();
        }
        return array;
    }

    public static ArrayList createList() {
        System.out.println("Enter list length");
        int listSize = ScannerService.scanInput();
        arrayList = new ArrayList();
        System.out.println("Fill in the list with numbers");
        for (int i = 0; i < listSize; i++) {
            arrayList.add(ScannerService.scanInput());
        }
        return arrayList;
    }
}
