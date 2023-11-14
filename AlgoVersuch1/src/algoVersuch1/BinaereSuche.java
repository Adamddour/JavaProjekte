package algoVersuch1;

public class BinaereSuche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int searchValue = 7;
        int result = binarySearch(array, searchValue, 0, array.length - 1);

        if (result != -1) {
            System.out.println("Der Wert " + searchValue + " wurde an der Position " + result + " gefunden.");
        } else {
            System.out.println("Der Wert " + searchValue + " wurde nicht gefunden.");
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
	            return binarySearch(A, searchValue, bottom, mid - 1);
	        else
	            return binarySearch(A, searchValue, mid + 1, top);
	    }
}
