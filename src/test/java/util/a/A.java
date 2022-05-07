package util.a;

public class A {

	public static void main(String[] args) {
		int a[] = { 5, 2, 6, 78, 13 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				System.out.print(i + "." + j);
				if (a[i] > a[j]) {
					System.out.println("  - " + a[i] + " | " + a[j]);
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				} else {
					System.out.println();
				}
			}

		}
		System.out.println("=================");

		for (int i : a) {
			System.out.println(i);
		}
	}
}
