package lab_3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab3_1 {
		
		public static void main(String args[]) {
			int n;
			int sum = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter integers");
			String s = sc.nextLine();

			StringTokenizer st = new StringTokenizer(s, " ");
			while (st.hasMoreTokens()) {
				String str = st.nextToken();
				n = Integer.parseInt(str);
				System.out.println(n);
				sum = sum + n;
			}
			System.out.println("sum of the integers is: " + sum);
			sc.close();
	}
}