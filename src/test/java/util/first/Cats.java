package util.first;

public class Cats {
	public static void main(String[] args) {
		mouse(1, 2, 3);
	}

	public static void mouse(int x, int y, int z) {
		int a = Math.abs(x - z);
		int b = Math.abs(y - z);
		if (a == b) {
			System.out.println("Escape Mouse");
		} else if (a > b) {
			System.out.println("B is catching the Rat");
		} else if (a < b) {
			System.out.println("A is Catching the Rat");
		}
	}

}
