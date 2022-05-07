package util.first;

public class S {
	
	public static void main(String[] args) {
		
		String str = "We are in New york";
		String str1 = ", USA";
		int a = 25;
		int b = 25;
		double d = 50.25;

		System.out.println(str + str1 + a +b);
		System.out.println(a +b + str + str1);
		
		System.out.println(str + str1 + (a +b));
		
		System.out.println(str + str1 +" "+ a+ ","+b);
		System.out.println(a+"" + b + str + str1);

		System.out.println(d + str + str1 +" "+ a+ ","+b);

		System.out.println(25 + 25 + "We are in New york,"+ "USA");

		System.out.println("We are in New york,"+ "USA" + 25 + 25);
		//System.out.println(str1);	
	}

}
