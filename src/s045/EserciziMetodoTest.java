package s045;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EserciziMetodoTest {

	@Test

	void toUpper2Null() { // void poi metto il nome del metodo che sto testando ed attaccatto che cosa
							// studio

		String result = EserciziMetodo.toUpper2(null); // chiamo la stringa result e chiamo il metodo toUpper sulla
														// classe EserciziMetodo e ci metto null

		Assertions.assertNull(result); // mi asserta che sia null

	}
	// mi dice che anche se metto null mi esce BOB perchè io ho messo BOB e non ho
	// preso una stringa generica
	
	
	@Test

	void toUpper2Empty() { // 

		String result = EserciziMetodo.toUpper2(""); 
		
		
		Assertions.assertTrue(result.isEmpty()); 
	}

	@Test

	void toUpperbOB() { // 

		String result = EserciziMetodo.toUpper("bOB"); 
		
		
		Assertions.assertEquals("BOB", result); 
	}





}
