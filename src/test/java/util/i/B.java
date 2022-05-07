package util.i;

public class B extends A{
	
	@Override
	public final void sum() {

		x = 250;
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		a.sum();
	}

}
