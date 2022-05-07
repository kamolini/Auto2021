package util.first;

public class Op {
	
	public static void main(String[] args) {
		
		int x = 50;
		int y = 50;
		
		int r = x % 2;
		//System.out.println(r);
		if(x > y) {
			System.out.println("Print from if statement");
		}
		else if (x == y) {
			System.out.println("Print from else if statement");
		}else {
			System.out.println("Print from else statement");
		}
	}
}
