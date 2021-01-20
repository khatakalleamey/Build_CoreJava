import java.util.Scanner;

public class LargestSmallestElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] z = new int [10];
		for(int i=0; i<z.length; i++) {
			System.out.println("Enter the value of  z["+i+"]");
			z[i] = s.nextInt();
		}

		int largest = z[0];
		int smallest = z[0];
		
		for(int i=0; i<z.length; i++) {
			if(z[i]>largest) 
				largest = z[i];
			
			if(z[i]<smallest) 
				smallest = z[i];
			
		}
		
		System.out.println("The Largest is "+largest+" . The Smallest is "+smallest);
	}

}
