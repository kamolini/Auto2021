package util.first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class AL {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(25);
		a.add(35);
		a.add(10);
		a.add(1);
		
		System.out.println(a.size());
		//System.out.println(a.get(1));
		
		a.add(1, 100);
		a.add(1, 101);
		a.remove(1);
		//System.out.println(a.get(1));
		//a.add(100, 100);
		
		System.out.println("==================");

		for (int i =0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("========== Map ========");

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("index", 1);
		map.put("age", 25);
		map.put("Phone", 3471542);
		
		System.out.println(map.size());
		
		System.out.println(map.get("phone"));
		
		Iterator<String>s =  map.keySet().iterator();
		
		while (s.hasNext()) {
			System.out.println(map.get(s.next()));	
		}
		
		for(String x : map.keySet()) {
			System.out.println(map.get(x));
		}
		
		System.out.println("==================");
		
		HashSet<String> ss = new HashSet<String>();
		
		System.out.println(ss.size());
		
		ss.add("FName");
		ss.add("LName");
		ss.add("Phone");
		
		//System.out.println(ss.con);
		System.out.println(ss.size());
		
		for(String x : ss) {
			System.out.println(x);
		}	
	}
}
