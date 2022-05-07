package util.first;

public class SE {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 12;
		
		String s = "We are in USA";
		String m = "We are in USA 15";
		
		s.equals(m);
		s.equalsIgnoreCase(m);
		s.contains(m);
		
		if(s.contentEquals(m)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
