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
		if (first > last) {
			return 0;
		}

		int cur = 0;
		int sum = 0;

		if (first % 2 != 0) {

			cur = first + 1;

		} else {
			cur = first;
		}
		while (cur < last + 1) {

			sum = sum + cur;

			cur += 2;

		}
		return sum;
	}

	public static long evenSum1(int first, int last) {
		int i = 0;
		int equalf = first % 2;
		long sum = 0;
		int cur = first + i;
		int equall = last % 2;
		int thelast = last - 1;
		if (equalf == 0 && equall == 0) {

			do {
				cur = first + i;
				sum = sum + cur;
				i += 2;

			} while (cur <= last);
			return sum;

		} else if (equalf == 0 && equall != 0) {

			do {
				cur = first + i;
				sum = sum + cur;
				i += 2;

			} while (cur < last);
			return sum;
		} else {
			int odd = first + 1;
			do {
				sum = odd += 2;
			} while (odd < thelast);

			return odd;
		}

	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		if (value < 0) {
			return 0;
		}

		int i = 0;
		if (value == 0 || value == 1) {
			return 1;
		}
		int cur = value * (value - 1);
		int result = 0;

		for (i = 2; i < value; i++) {

			cur = (value - i) * cur; // cur=value*(value-i); così moltiplica value per i vari value-i, invece voglio
										// moltiplicare il risultato di quello per il successivo valore

		}

		return cur;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, …)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */

	public static long fibonacci1(int value) {
		int a = 0;
		if (value == 0) {
			a = 0;
			return a;

		}

		int b = 0;
		if (value == 1) {

			b = 1;
			return b;
		}

		int fib = 0;

		for (int i = 1; i < value; i++)

			fib = a + b;
		a = b;
		a = fib;

		return fib;
	}

	public static long fibonacci(int value) {
		if (value == 0) {
			return 0;
		}
		if (value == 1) {
			return 1;
		}

		long[] array = new long[value + 1]; // se inizializzo dentro if e poi non entra poi lo perdo
		array[0] = 0;
		array[1] = 1;

		for (int i = 2; i <= value; i++) {
			array[i] = array[i - 2] + array[i - 1];

		}

		return array[value]; // lui sa già che quando i=value esce e stampa quello, non devo inizializzarlo
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */

	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[value][value];
		int i = 0;
		int j = 0;

		for (i = 1; i < value; i++) {
			for (j = 1; j < value; j++) {

				result[i - 1][j - 1] = i * j; // il fatto che io sia partita da 1 non vuol dire che adesso lo spazio 0
												// lo chiamo 1. mi mette le cose nello spazio 1 e mi da sbagliato

			}
		}

		return result;
	}
}
