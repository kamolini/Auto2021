package util.eh;

public class B extends A{
	
	public static void main(String[] args){
		try {
			sum();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
