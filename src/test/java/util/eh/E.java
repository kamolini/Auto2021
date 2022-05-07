package util.eh;

import java.io.FileNotFoundException;

public class E {
	
	public static void main(String[] args) throws Exception {
		
		try {
			int i = 9/0;
		} finally {
			System.out.println("finally");
		}
	
		
		System.out.println(1);
		System.out.println(1);

		
		System.out.println(1);
		System.out.println(1);
		
	}

}
