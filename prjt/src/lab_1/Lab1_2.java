package lab_1;

import java.util.Scanner;

public class Lab1_2 {
	
	public int calculateDifference (int n) {
		
		int a = 0;
		double c = 0;
		for(int i=0; i<=n; i++) {
			a = (n*(n+1)*(2*(n)+1))/6;
			c = (n*(n+1))/2;
		}
				
		int b =  (int) Math.pow(c, 2);
		int diff = a - b;
		return diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Lab1_2 c = new Lab1_2();
		
		System.out.println(c.calculateDifference(n));
		
		sc.close();
	}
}
