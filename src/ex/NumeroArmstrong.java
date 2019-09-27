package ex;

public class NumeroArmstrong {

	// VOGLIO UN METODO CHE MI DICA TRUE SE E' ARMST. => E' UN BOOL

	public boolean numArmostrong(int j) {
		if (j <= 0) {
			throw new IllegalArgumentException("Number should be positive");
		}

		int value = j;
		int number = j;

		int k = 0;
		while (number > 0) {
			number /= 10;
			k += 1;
		}
		
		int resto = 0;
		int sum = 0;

		for (int i = 0; i < k; i++) {
			resto = value % 10;
			value /= 10;
			sum = sum + (int) (Math.pow(resto, k+1));

		}

		return sum == j;
	}
}
