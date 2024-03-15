package cy.olesiabokk.arrayexercices.main;

import cy.olesiabokk.arrayexercices.util.ArraysCreator;
import cy.olesiabokk.arrayexercices.util.SearchResult;

public class Main {

    public static void main(String[] args) {
        ArraysCreator.createArray();
        SearchResult.showEvenNumQuantity();
        SearchResult.showOddNumQuantity();
        SearchResult.showPrimeNumQuantity();
        SearchResult.showNumbersSum();
        SearchResult.showSubstraction();
        SearchResult.zeroQuantity();
        SearchResult.bubbleSortArray();
        SearchResult.insertSort();
        SearchResult.selectionSort();
        SearchResult.sortArrayList();
        SearchResult.sortArray();
    }
}
