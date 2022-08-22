package lab_1;

import java.util.Scanner;

public class Lab1_7 {

	private static int fibonacci1(int n) {
		// recursive
		if (n <= 1) {
			return n;
		}
		    return fibonacci1(n-1) + fibonacci1(n-2);
	}

	private static int fibonacci2(int n) {
		// non-recursive
		int a=1,b=1,c=0;
		for(int i=2;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println("For using recursive function 'm' value as 1 ");
		System.out.println("For using non recursive function 'm' value as 2 ");

		System.out.println("Enter the value of m:");
		int m = sc.nextInt();
		
		
		if(m==1) {
			System.out.println("recursive. Ans: "+ fibonacci1(n));
		}
		
		if(m==2) {
			System.out.println("non-recursive. Ans:  "+ fibonacci2(n));
		}
		
		sc.close();
	}
}
