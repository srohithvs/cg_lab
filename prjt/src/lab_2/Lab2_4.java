package lab_2;

import java.util.Arrays;

public class Lab2_4 {
	
	public void modifyArray() {
			int arrayWithDuplicates[] = {2, 3, 1, 1, 3, 6};   
			Arrays.sort(arrayWithDuplicates);
			int len = arrayWithDuplicates.length;   
			
			int[] distinctArray = new int[20]; 
			int index = 0;
			
			for (int i = 0; i < len; i++) {   
		          int flag = 0;  
		          for (int j = 0; j < i; j++){  
		             if (arrayWithDuplicates[i] == arrayWithDuplicates[j]){   
		                flag = 1;  
		                break; 
		             }
		          }
		          if (flag == 0){   
		             distinctArray[index] = arrayWithDuplicates[i];  
		             index++;  
		          }  
		        }
			 for(int i = 0; i < index; i++) {  
		          System.out.print(distinctArray[i] + " ");  
			 }
		}
		
	public static void main(String[] args) {
			Lab2_4 a = new Lab2_4();
			a.modifyArray();
		}
}

