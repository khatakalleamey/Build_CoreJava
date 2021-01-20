package array;

class Student{
	public int RollNo;
	public String Name;
	
	Student(int RollNo, String Name){
		this.RollNo = RollNo;
		this.Name = Name;
	}
}
public class Simple {
  
	public static void main(String[] args) {
		Student[] arr;
		
			arr = new Student[5]; 
			
			arr[0] = new Student(1,", Ashish");
			arr[1] = new Student(2,", Vijay");
			arr[2] = new Student(3,", Imtiaz");
			arr[3] = new Student(4,", Deepak");
			arr[4] = new Student(5,", Sachin");
			
			for(int i = 0; i<arr.length; i++) {
				System.out.println("Element at "+ i + " : " + arr[i].RollNo + " " +arr[i].Name);
			}
			
			int[][] arr1 = { {2,7,9},{3,5,6},{1,5,9} };		;
			
			 for (int i=0; i< 3 ; i++) 
		        { 
		            for (int j=0; j < 3 ; j++) {
		                System.out.print(arr1[i][j] + " "); 
		            }
		            System.out.println(); 
		        } 
		   
	
	int arr2 [] = {1,2,3,4,5,6};
	int arr3 [] = {24,1,2};
	multiply(arr3);
	sum(arr2);
	
	
	
	
	
	
	
	
	
	}

	public static void multiply(int[] arr3) {
		int multiply = 1;
		for(int j=0; j<arr3.length; j++) {
			multiply*=arr3[j];
		}
		System.out.println("Multiplication of Array is : "+multiply);
		
	}

	public static void sum(int[] arr2) {
		
		
		
		int sum = 0;
		
		for(int i = 0; i<arr2.length; i++) {
			sum+=arr2[i];
			
		}
			System.out.println("Sum of Array values : " + sum);
			
		
	}	
	}
	
	
	


