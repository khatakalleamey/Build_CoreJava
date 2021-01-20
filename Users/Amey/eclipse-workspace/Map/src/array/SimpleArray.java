package array;

import java.util.Scanner;

public class SimpleArray {

	//1.Take 10 integer inputs from user and store them in an array and print them on screen.
	
	/*2.Take 10 integer inputs from user and store them in an array. Again ask user to give 
	a number. Now, tell user whether that number is present in array or not.*/
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] z = new int[10];
		for(int i = 0; i < z.length; i++) {
			System.out.println("Print the value of z["+i+"]");
			z[i]=s.nextInt();
			}
			int toFind = 46;
			boolean found = false;
			System.out.println("User have given the value to find whether that "+toFind);
			for(int n : z) {
				if(n == toFind) {
					found=true;
					break;
				}  
				
			} 
			//2.
			if(found) {
				
				System.out.println("The Number found is "+toFind);
			}else {
				
			System.out.println("The Number found is not same as "+toFind);	
			}
			
		for(int i = 0; i<z.length; i++) {
			//1.
			System.out.println("the value of z["+i+"] is "+z[i]);
		}
		
		
		System.gc();
		
}}
