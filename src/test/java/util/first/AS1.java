package util.first;

public class AS1 {

	public static void main(String[] args) {

		// Sorting with ascending or descending order
		int a[] = {10,9,8,7,6,5,4,3,2,1,0};
		int temp = 0;
		// Sort array
		// 1st loop to get the value for every index from 0 to end
		for (int i = 1; i < a.length; i++) {
			// 2nd loop to get the value from 1st loops current index to 0
			for (int j = i; j > 0; j--) {
				System.out.print(i+"."+j);
				// if 1st index grater than 2nd index than swap the value
				if (a[j] > a[j - 1]) {
					temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
					System.out.println(" - "+ true);
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
