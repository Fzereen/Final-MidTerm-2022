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
		int start = 2;
		int end = 1000000;
		prime(start, end);


	}

	public static void prime(int start, int end) {
		for (int i = start; i <= end; i++) {
			int div_counter = 0;
			//checks divisiblity of each number, if its prime it should only be divisible twice by one and itself ie counter
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					div_counter++;
				}
			}
			if (div_counter == 2) {
				System.out.print(i + ",");
			}

		}
	}

}