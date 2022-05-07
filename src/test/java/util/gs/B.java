package util.gs;

public class B {
	
	public static void main(String[] args) {
		
		A a = new A();
		int y = a.getX();
		
		System.out.println(y);
		a.setX(501);
		
		System.out.println(a.getX());
		
		A aa = new A();
		
		System.out.println(aa.getX());
		
		A aaa = new A();
		
		aaa.setX(5000);
		
		System.out.println(a.getX());
		System.out.println(aa.getX());
		System.out.println(aaa.getX());
	}

}
