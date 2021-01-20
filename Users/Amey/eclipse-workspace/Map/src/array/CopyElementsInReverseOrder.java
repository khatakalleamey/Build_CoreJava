package array;

import java.util.Scanner;

public class CopyElementsInReverseOrder {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int[] Z = new int[10];
		int[] X = new int[10];
		
		for(int i = 0; i<Z.length; i++) {
			System.out.println("Print tha value of array as given as stands Z["+i+"]");
		Z[i]=s.nextInt();
			
		}
		  
		int j = 0;
		for(int i = X.length-1; i>=0; i--) {
			X[i]=Z[j];     
			j++;
		}
		for(int i =0; i<X.length; i++) {
			System.out.println("The value of X["+i+"] is "+X[i]);
		}

	}  
}
