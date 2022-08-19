package lab_2;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2_2 {
	
	public String sorted(String[] arr) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		String[] arr1 = new String[n];
		
		for(int i=0;i<n;i++) {
			arr1[i] = sc.next();
		}
		
		Arrays.sort(arr1);
		
		String[] result = new String[n];
		for (int i = 0; i < arr1.length/2; i++) {
			result[i] = arr1[i].toLowerCase();
		}
		for (int i = arr1.length/2; i < arr1.length; i++) {
			result[i] = arr1[i].toUpperCase();
		}
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]);
			System.out.print(" ");
		}
		
		System.out.println();
		sc.close();
		return "exit";
	}

	public static void main(String[] args) {
	
		String[] ans = null;

		Lab2_2 a = new Lab2_2();
		System.out.println(a.sorted(ans));
	
	}

}
