package lab_1;

import java.util.Scanner;

public class Lab1_4 {

	public boolean checkNumber(int number) {
		
		while(number != 1) {
			if (number%2 != 0) {
				return false;
			}
			number=number/2;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		Lab1_4 n = new Lab1_4();
		System.out.println(n.checkNumber(number));
		
		sc.close();
	}

}
