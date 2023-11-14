package algoVersuch1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {87,5,8,2,10,9,7};
		System.out.print("Array:" +Arrays.toString(array));
		sortiere(array,0,array.length-1);
		System.out.print("Array:" +Arrays.toString(array));
		
		
 	}
	
	public static void sortiere(int[] array,int begin,int end) {
		if(begin<end) {
			
			int mitte=(begin+end)/2;
			sortiere(array,begin,mitte);
			sortiere(array,mitte+1,begin);
			merg(array,begin,mitte,end);
			
			/*
			 	Sie sortiert das übergebene Array zwischen den Indizes begin und end.
				Die Methode verwendet Rekursion, um das Array in immer kleinere Teile 
				zu teilen und dann wieder zu fusionieren. 
			 */
		}
		
	}
	
	public static void merg(int[] array,int begin,int mittel,int end) {
		//Die Methode copyOfRange gehört zur Java-Klasse Arrays 
		//und wird verwendet, um einen Teil eines Arrays zu kopieren
		//Das +1 beim Parameter end ist notwendig, da end nicht in die Kopie eingeschlossen wird.
		//
		
		int[] tempArray=Arrays.copyOfRange(array, begin, end+1);
		int i=begin;
		int j=mittel+1;
		int k=begin;
		
		/*
		 int i = begin;: Der Index für den ersten Teil des zu mergenden Arrays.
    	int j = middle + 1;: Der Index für den zweiten Teil des zu mergenden Arrays.
    	int k = begin;: Der Index für die Position im ursprünglichen Array, 
    	in das die gemergten Elemente geschrieben werden.
		 */
		System.out.println("Mergende Array: "+Arrays.toString(tempArray));
		
		while(i<=mittel&&j<=end) {
			
			if(tempArray[i-begin]>=tempArray[j-begin]) {
				
				array[k]=tempArray[i-begin];
				i++;
			}
			else {
				array[k]=tempArray[j-begin];
				j++;
			}
			k++;
		}
		
		while(i<=mittel) {
			array[k]=tempArray[i-begin];
			i++;
			k++;
		}
		
		System.out.println("Gesammte Array:"+ Arrays.toString(Arrays.copyOfRange(array, begin, end) ));
		
	}

}
