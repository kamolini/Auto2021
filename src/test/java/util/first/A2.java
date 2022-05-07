package util.first;

import java.util.Iterator;

public class A2 {
	
	public static void main(String[] args) {
		
		int x[][]= {{25,20,41,52},{10},{2}};
		
		System.out.println(x.length);
		System.out.println(x[2].length);
		
		System.out.println("==================================");
		int y [][] = new int[3][2];
		
		y[0][0] = 0;
		y[0][1] = 01;
		
		y[1][0] = 10;
		y[1][1] = 11;
		
		y[2][0] = 20;
		y[2][1] = 21;
		
		int nor = y.length;
		int noc = y[0].length;
		
		for (int i =0; i< nor; i ++) {
			for (int j =0; j< noc; j ++) {
				System.out.print(y[i][j]+"     ");
			}
			System.out.println();
		}
		
		System.out.println("==================================");

		int t = 10;
		int sum = 0;
		
		for (int k =0; k< t; k ++) {
			System.out.print(sum +" + "+k +" = ");
			sum = sum + k;
			System.out.println(sum);
		}	
	}
}
