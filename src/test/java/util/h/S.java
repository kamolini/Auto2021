package util.h;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class S {
	public static void main(String[] args) {
		
		S s = new S();
		int i[] = {9,8,9,9,8,7,6,6,6,6};
		int v = s.sc_s2(i);
		System.out.println(v);
	}
	
	public int sc(int x[]) {
		int totalPSC = 0;
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i <x.length; i++) {
			if(set.contains(x[i])){
				totalPSC = totalPSC + 1;
				set.remove(x[i]);
			}else {
				set.add(x[i]);
			}
		}
		return totalPSC;
	}
	
	
	
	
	
	
	
	public int sc_s2(int x[]) {
		int totalPSC = 0;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i <x.length; i++) {
			if(map.containsKey(x[i])){
				int v = map.get(x[i]);
				map.put(x[i], v+1);
			}else {
				map.put(x[i], 1);
			}	
		}
		
		System.out.println();
		
		return totalPSC;
	}
	
	
	
	
	
	

}
