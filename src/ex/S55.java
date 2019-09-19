package ex;

public class S55 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */

	public static long sum(int first, int last) { // risolvo subito i casi particolari

		if (first == last) {
			return first;
		}

		if (last < first) {
			return 0;
		}

		boolean check = true;

		long sum = first;
		// int first1 = first; non è più necessario,perchè sommo 1 e continuo a sommare
		// 1 al prossimo ciclo direttamente su first
		do {
			first += 1; // first1++;
			if (first != last) {

				sum = sum + first;

			} else {
				check = false;
			}

		} while (check == true);

		sum = sum + last;
		return sum;

		// else {return 0; } ho affrontato la cosa dall'inizio allora non è necessario
		// l'else
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */

	public static long evenSum(int first, int last) {

		int cur = first += 1;
		if (cur % 2 == 0) {
			
			
			long sum = cur;
			return sum;
		} else {
			return 0;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		// TODO
		return 0;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, …)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		// TODO
		return 0;
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[0][0];

		// TODO

		return result;
	}
}
