package util.first;

public class AS {

	public static void main(String[] args) {

		// Sorting with ascending or descending order
		int a[] = { 10,9,8,7,6,5,4,3,2,1,0};
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				System.out.print(i+"."+j);
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					System.out.println(" - "+true);
				}else {
					System.out.println();
				}
			}

		}
		
		
		
		
		
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
