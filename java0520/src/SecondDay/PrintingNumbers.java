package SecondDay;

public class PrintingNumbers {

	public static void main(String[] args) {
		/*
		 * 9 8 7 6 5 4 3 2 1 0 8 7 6 5 4 3 2 1 0 7 6 5 4 3 2 1 0 6 5 4 3 2 1 0 5 4 3 2 1
		 * 0 4 3 2 1 0 3 2 1 0 2 1 0 1 0 0
		 */

		int i = 9;
		while (i >= 0) {
			int k = i;
			while (k >= 0) {
				System.out.print(k + " ");
				k--;
			}
			System.out.println();
			i--;
		}

	}

}
