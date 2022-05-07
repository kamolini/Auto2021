package util.c;

import java.util.HashMap;
import java.util.Map;

public class A {
	int cb =25;
	static int pb =25;
	
	public A() {
		
	}
	public A(int i) {
		
	}
	
	public void sum() {
		 
	}
	
	public int sum(int d) {
		 return 4;
	}
	
	public static void main(String[] args) {
		
		Map<String,String> m = new HashMap<String, String>();
		
		
		for (String s : m.keySet()) {
			System.out.println(m.get(s));
			
		}
		
		while (m.keySet().iterator().hasNext()) {
			System.out.println(m.get(m.keySet().iterator().next()));
			
		}
		
		
		
		
		
	}
	
	
	

}
