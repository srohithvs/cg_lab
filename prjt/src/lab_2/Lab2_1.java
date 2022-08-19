package lab_2;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2_1 {
	
	public int getSecondSmallest(int[] arr) {
		
		Arrays.sort(arr);
		return arr[1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Lab2_1 a = new Lab2_1();
		System.out.println(a.getSecondSmallest(arr));
		
		sc.close();
	}

}
