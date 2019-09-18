package s50;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

import s050.Simple;

class SimpleTest {
    @Test
    public void negatePositive() {
        Simple simple = new Simple();   //così creo un oggetto
        int value = 42;

        int result = simple.negate(value);

        assertThat(result, equalTo(-42));
    }
}
