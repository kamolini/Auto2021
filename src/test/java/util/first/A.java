package util.first;

public class A {
	
	int a = 20;
	static int sa = 25;
	
	static A aa =new A();;
	
	public void printK() {
		System.out.println(a);
		System.out.println(sa);

	}
	
	public static void printK1() {
		
		//
		//System.out.println(a);
		System.out.println(sa);
		
	}
	
	public static void main(String[] args) {
		
		
		aa.printK();
		printK1();
	}
	
	
	
	

}
