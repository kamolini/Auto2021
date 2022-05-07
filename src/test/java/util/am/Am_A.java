package util.am;

public class Am_A {
	
	private String 		pri = "private";
	protected String 	pro = "protected";
	String  			def = "def";
	public  			String pub = "public";
	protected String c = "Class v";
	private void pri() {
		System.out.println("private");
	}
	
	protected void pro() {
		System.out.println("protected method");
	}
	
	void def() {
		System.out.println("Def");
	}
	
	public void pub() {
		System.out.println("public");
	}
	
	public void x() {
		
	}
}
