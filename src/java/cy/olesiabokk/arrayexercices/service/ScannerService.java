package cy.olesiabokk.arrayexercices.service;

import java.util.Scanner;

public class ScannerService {
    private static Scanner sc = new Scanner(System.in);

    public static int scanInput() {
        return sc.nextInt();
    }
}
