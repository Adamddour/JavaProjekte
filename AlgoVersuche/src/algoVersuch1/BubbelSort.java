package algoVersuch1;


public class BubbelSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {87, 80, 65, 77, 39, 88, 22, 11};

        System.out.print("Unsortiertes Array: ");
        printArray(array); 
        bubbleSort(array);
        System.out.print("Sortiertes Array: ");
        printArray(array);
	}
	
	static public void bubbleSort(int[] a) {
		boolean swapped = false; // Vermerkt ob Vertauschung im Durchlauf
		int j = 0;
		do { // Beginn des Durchlaufes
		swapped = false;
		for (int i = 0; i < a.length-1- j; i++) {
					if (a[i] < a[i + 1]) { // Vergleiche Elemente
					swap(a, i, i + 1); // Vertausche ggfs. Elemente
					swapped = true; // Vermerkt:(mind. 1) Vertauschung passiert
				}
			}
			j++;
			
		} while (swapped); // Ende des Durchlaufes
	}

	static public void swap(int[] a, int i, int j) {
	    int temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}
	static public void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }


}
