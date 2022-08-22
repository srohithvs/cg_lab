package lab_6;

import java.util.*;

public class lab6_1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt();
		
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++) {
			int k=sc.nextInt();
			int v=sc.nextInt();
			map.put(k,v);
		}
		
		List<Integer> list=new ArrayList<Integer>(map.values());
		Collections.sort(list);
		System.out.println(list); 
		
		sc.close();
	}

}

