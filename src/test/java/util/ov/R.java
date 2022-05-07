package util.ov;


public class R {
	
	public static void main(String[] args) {
		Orp orp = new Orp();
		Or or = new Or();
		
		orp.payment(5);
		
		or.payment(5);
		or.payment("");
		or.payment(5.5);
	}
}
