package s51;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import s051.Simple;

class SimpleTest {
    private Simple simple;

    @BeforeEach //= fallo ogni volta prima di un test
    public void init() {
        simple = new Simple();
    } // il metodo init inizializza un oggetto per farsì che poiposso semplicemente usarlo e non inizializzarlo ad ogni test

    @Test
    public void negatePositive() {
        int value = 42;

        int result = simple.negate(value);

        assertThat(result, equalTo(-42));
    }
}
