package algoVersuch1;

import javax.swing.JOptionPane;

public class BinaereSuche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int[] x = {10,9,8,7,6,5};
		  	int gesuchteElement=Integer.parseInt(JOptionPane.showInputDialog("Bitte Zahl eingeben:"));
	
		  	
	        int foundIndex = binarySearch(x, gesuchteElement, 0, x.length - 1);

	        if (foundIndex!= -1) {
	            System.out.println("Element " + x[foundIndex] + " gefunden an Index: " + foundIndex);
	        } else {
	            System.out.println("Element " + gesuchteElement + " nicht gefunden");
	        }
	}

	static int binarySearch (int[] A, int searchvalue, int bottom, int top)
	{
		   if (top < bottom) {
	            return -1;  
	        }

	        int mid = bottom + ((top - bottom) / 2);

	        if (A[mid] == searchvalue) {
	            return mid; 
	        } else if (A[mid] < searchvalue) {
	            return binarySearch(A, searchvalue, bottom, mid - 1);
	        } else {
	            return binarySearch(A, searchvalue, mid + 1, top);
	        }
	    }
	
}
