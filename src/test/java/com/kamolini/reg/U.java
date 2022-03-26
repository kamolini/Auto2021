package com.kamolini.reg;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;


public class U {
	
	public static void main(String[] args) {
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date d = new Date();
		
		String ts = date.format(d);
		
		ts = ts.replace(" ", "_");
		ts = ts.replace(":", "_");
		ts = ts.replace(".", "_");
		ts = ts.replace("-", "_");
		
		System.out.println(ts+"@gmail.com");
		
		String uid = UUID.randomUUID().toString();
		System.out.println(uid+"@gmail.com");
		
		
		int min = 0;
        int max = 10;
        int x =  (int) ((Math.random() * (max - min)) + min);
        System.out.println(x);
        
        
        List<Integer> list = new ArrayList<Integer>();
        //list.get(1);
        
        Set<String> set = new HashSet<String>(); 
        
        set.add("Shuvro");
        set.add("Kamol");
        
        String a = set.iterator().next();
        String b = set.iterator().next();
        
        System.out.println("value of a - "+a);
        System.out.println("value of b - "+b);
        
        Iterator<String> it =  set.iterator();
        
        a = it.next();
        b = it.next();
        
        System.out.println("value of a - "+a);
        System.out.println("value of b - "+b);
        
        
        while (it.hasNext()) {
        	System.out.println(it.next());
			
		}
        
        for(String s : set) {
        	System.out.println(s);
        }
        
        
	}
	
	public static int getNumFromBet() {
        int min = 111111;
        int max = 999999;
        return (int) ((Math.random() * (max - min)) + min);
    }

}








