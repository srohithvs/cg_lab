package lab_1;

import java.util.Scanner;

public class Lab1_5 {
	private static double cubes(int n) {

		double sum = 0.0;
		while(n>0) {
			
			sum += (Math.pow((n%10), 3));
			n = n/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(cubes(n));
		
		sc.close();
	}

}
