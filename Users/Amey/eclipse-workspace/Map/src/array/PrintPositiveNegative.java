package array;

import java.util.Scanner;

public class PrintPositiveNegative {
	
public static void main(String[] args) {
	
	Scanner s =new Scanner(System.in);
	int z[] = new int[10];
	int positive = 0;
	int negative = 0;
	int odd = 0;
	int even = 0;
	int zero = 0;
	
	for(int i = 0; i<z.length; i++) {
		System.out.println("Print the value of z["+i+"]");
		z[i]=s.nextInt();
		
		if(z[i]>0) {
			positive++;
		}
		
		if(z[i]<0) {  
			negative++; 
		}
		
		if(z[i]%2==0) {
			even++;
		}
		
		if(z[i]%2 != 0) {
			odd++;
		}
		
		if(z[i] == 0) {
			zero++;
		}
	}
	System.out.println("Positive : "+positive+"\nNegative : "+negative+"\nZero : "+zero+"\nodd : "+odd+"\neven : "+even);	
	
	System.gc();

}
}


