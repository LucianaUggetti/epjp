package ex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumeroArmstrongTest {

	@Test
	void test() {
		int number = 153;
		NumeroArmstrong na = new NumeroArmstrong();
		assertTrue(na.numArmostrong(number));
	}

	@Test
	void testNegative() {
		NumeroArmstrong na = new NumeroArmstrong();
		assertThrows(IllegalArgumentException.class, () -> na.numArmostrong(-21));
	}

	@Test
	void testZero() {
		int number = 0;
		NumeroArmstrong na = new NumeroArmstrong();
		assertTrue(na.numArmostrong(number));
	}
}
