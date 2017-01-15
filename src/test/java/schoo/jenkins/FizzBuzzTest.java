package schoo.jenkins;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    private FizzBuzz sut;

    @Before
    public void setup() {
        sut = new FizzBuzz();
    }

    @Test
    public void testFizz() {
        assertThat(sut.execute(3), is("Fizz"));
    }

    @Test
    public void testBuzz() {
        assertThat(sut.execute(5), is("Buzz"));
    }

    @Test
    public void testFizzBuzz() {
        assertThat(sut.execute(15), is("FizzBuzz"));
    }

    @Test
    public void testNumber() {
        assertThat(sut.execute(1), is("1"));
    }
}
