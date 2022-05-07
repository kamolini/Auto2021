package util.h;

public class SC {
	
	
	public static void main(String[] args) {
		staircase(6);
	}
	
	
	static void staircase(int n) {
        for(int i=1; i<=n ; i++){
            int i1= n-i;
            for(int f=0; f<i1; f++){
                System.out.print(" ");
            }
            for(int f=0; f<i; f++){
                System.out.print("#");
            }
            System.out.println("");
        }

    }
}
