package lab_1;

import java.util.Scanner;

public class Lab1_3 {
	
	public boolean checkNumber(int number) {
		
		String a = Integer.toString(number);
		char[] arr = a.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if (i+1 < arr.length) {
				if (arr[i] > arr[i+1]) {
					return false;
				}
			}
		}
		return true;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Lab1_3 result = new Lab1_3();
		
		System.out.println(result.checkNumber(n));
		
		sc.close();
	}

}
