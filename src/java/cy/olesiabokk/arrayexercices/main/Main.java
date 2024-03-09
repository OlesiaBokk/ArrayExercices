package cy.olesiabokk.arrayexercices.main;

import cy.olesiabokk.arrayexercices.service.ScannerService;
import cy.olesiabokk.arrayexercices.util.SearchResult;

public class Main {

    public static void main(String[] args) {
        ScannerService reader = new ScannerService();
        reader.inputReader();
        SearchResult.showEvenNumQuantity();
        SearchResult.showOddNumQuantity();
        SearchResult.showPrimeNumQuantity();
        SearchResult.showNumbersSum();
        SearchResult.showSubstraction();
        SearchResult.zeroQuantity();
        SearchResult.bubbleSortArray();
        SearchResult.insertSort();
        SearchResult.selectionSort();
    }
}
