package util.first;

public class SS {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 15;
		int c = 25;
		int d = 35;
		
		a = b;
		b = c;
		c = a;
		d = b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("==========================");
		a = a ++;
		a = a ++;
		
		System.out.println(a);
		
		System.out.println("==========================");

		int x = 15;
		
		x = x + x;
		x = x + x;
		System.out.println(x);
		System.out.println(d);
	}
}
