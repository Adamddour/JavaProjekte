package algoVersuch1;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		
		for(int i=1;i<=8;i++) {
			
			for(int j=1;j<=6;j++) {
				
				sum=i*j;
				
				if(i==j&& sum<10) {
					
					System.out.print(" "+i*j+"  ");
				}
				else if(i==j&&sum>10) {
						System.out.print(" "+i*j+" ");
					}
				else {
				
					System.out.print("a"+i+""+j+" ");
				}
			}
			System.out.println();
		}
		
	}
}
	

	
	
	
	

	

	

