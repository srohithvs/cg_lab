package lab_6;

import java.util.*;

public class Lab6_1 {
	
	List<Integer> getValues(HashMap<Integer,Integer> hm){
		
		List<Integer> list=new ArrayList<Integer>(hm.values());
		Collections.sort(list);
		return list; 
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt();
		
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			int k = sc.nextInt();
			int v = sc.nextInt();
			map.put(k,v);
		}
		
		Lab6_1 a = new Lab6_1();
		List<Integer> b = a.getValues(map);
		System.out.println(b);
		
		sc.close();
	}

}

