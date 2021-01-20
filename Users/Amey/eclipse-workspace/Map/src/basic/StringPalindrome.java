package basic;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String original, reverse="";
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String/Number if it is palindrome");
		original = in.nextLine();
		int length = original.length(); 
		for(int i=length-1;i>=0;i--) { 
        reverse = reverse + original.charAt(i); 
        System.out.println(reverse);
		}
		if(original.equals(reverse)) {
			System.out.println("The Number is palindrome");
		}
		else {
			System.out.println("The Number is not palindrome");  
		}
			
		
	}

}
