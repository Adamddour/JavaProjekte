package algoVersuch1;

import javax.swing.JOptionPane;

public class BinaereSuche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {6,5,4,3,2,1};
	
		int zahl=Integer.parseInt(JOptionPane.showInputDialog("Bitte Zahle eingeben:"));
		
		for(int i=0;i<array.length-1;i++) {
			
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		
        int result = binarySearch(array, zahl, 0, array.length - 1);

        if (result != -1) {
            System.out.println("Der Wert " + zahl + " wurde an der Position " + result + " gefunden.");
        } else {
            System.out.println("Der Wert " + zahl + " wurde nicht gefunden.");
        }
	}

	 public static int binarySearch(int A[], int searchValue, int bottom, int top) {
	        // Invarianten: searchValue >= A[i] für alle i < bottom,
	        // searchValue < A[i] für alle i > top
	        if (top < bottom)
	            return -1; // Wert wurde nicht gefunden
	        int mid = bottom + ((top - bottom) / 2);
	        if (A[mid] == searchValue)
	            return mid; // Wert wurde gefunden
	        else if (A[mid] > searchValue)
	            return binarySearch(A, searchValue, bottom, mid - 1);//Linke 
	        else
	            return binarySearch(A, searchValue, mid + 1, top);//Recht
	    }
}
