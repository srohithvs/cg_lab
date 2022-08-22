package lab_1;

import java.util.Scanner;

public class Lab1_8 {
	public static void main(String arg[]){
	      
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		
		int i, j, count;
	    
	    System.out.println("Prime Numbers from 1 to " + number);
	     for(i=2; i<=number; i++)
	     {
	         count = 0;
	         for(j=2; j<i; j++)
	         {
	            if(i%j==0)
	            {
	               count++;
	               break;
	            }
	        }
	         if(count==0)
	            System.out.print(i+ " ");
	     }
	}
}
