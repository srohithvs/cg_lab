package lab_1;

import java.util.Scanner;

public class Lab1_1 {
	
	public static int calculateSum(int n) {
		int sum = 0;
		 for (int i=1;i<=n;i++) {
			 if(i%3 == 0 || i%5 == 0) {
				 sum = sum + i;
			 }
		 }
		 return sum;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int total = 0;
		total = calculateSum(n);
		System.out.println(total);
		sc.close();
	}

}
