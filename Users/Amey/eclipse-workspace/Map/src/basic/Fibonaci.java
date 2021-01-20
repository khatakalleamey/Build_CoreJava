package basic;

public class Fibonaci {
	
	
public static void main(String args[]) {
	  //Without Recursion
		 int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
}
}

//Using Recursion
/*
 static int n1=0,n2=1,n3=0;
 static void printFibonacci(int count){
 if(count>0){
 n3=n1+n2;
 n1=n2;
 n2=n3;
 System.out.println(" "+n3);
 printFibonacci(count-1);
 
 }}
 public static void main(String args[]){
int count = 10;
System.out.println(n1+" "+n2);
printFibonacci(count-2);
 }
 */
