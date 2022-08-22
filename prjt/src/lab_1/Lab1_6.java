package lab_1;

import java.util.Scanner;

public class Lab1_6 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		if(str.equals("red")) {
			System.out.println("Light is red");
			System.out.println("stop");
		}
		else if(str.equals("yellow")) {
			System.out.println("Light is yellow");
			System.out.println("ready");
		}
		else if(str.equals("green")) {
			System.out.println("Light is green");
			System.out.println("Go");
		}
		else {
			System.out.println("wrong input");
		}
		
		sc.close();
	}
}
