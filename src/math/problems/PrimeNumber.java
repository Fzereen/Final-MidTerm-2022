package math.problems;

import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int n = 100;
		System.out.println(arraylist(n));
	}

	private static boolean arraylist(int n) {
	}

	public static ArrayList arrayList(int n){
		int count = 1, j = 0;
		ArrayList<Integer> ar = new ArrayList<>();
		int[] array1 = new int[40];
		while(n>0) {
			for (int i = 0; i < 10; i++) {
				ar.add(n);
				array1[j] = n;
				n -= count;

			}
		}
	}

}
