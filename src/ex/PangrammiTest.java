package ex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PangrammaTest {

	@Test
	void pangrammaTrue() {
		String s= "Thequickbrownfoxjumpsoverthelazydog";
		Pangramma pm=new Pangramma();
		assertTrue(pm.pangramma(s));
	}

}
