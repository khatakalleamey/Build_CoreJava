package basic;

public class Armstrong {

	public static void main(String[] args) {
		// 0, 1, 153, 370, 371, 407 - Refered to as a Armstrong Number
		
		int c=0,a,temp;
		int n=372;
		temp=n;
		while(n>0) {
			a=n%10;
			System.out.println(a);
			n=n/10;
			System.out.println(n);
			c=c+(a*a*a);
			System.out.println(c);
		}
		if(temp==c) {
			System.out.println("The given Number is Armstrong Number");
		}else
		{
			System.out.println("The given Number is not an Armstrong Number");
		}
	}

}
