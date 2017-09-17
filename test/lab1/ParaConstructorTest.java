package lab1;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

// this is going to be a parameterized test class for MyMath.div() using a constructor

@RunWith(value = Parameterized.class)
public class ParaConstructorTest {
	
	public int numberA;
	public int numberB;
	public int expected;
	
	// inject via constructor
	public ParaConstructorTest(int numberA, int numberB, int expected) {
		this.numberA = numberA;
		this.numberB = numberB;
		this.expected = expected;
	}
	
	// this is where we will get the data from
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[] [] {
			{8, 4, 2},
			{1000, 1, 1000},
			{9, 3, 3}
		});
	}

	@Test
	public void test() {
		assertThat(MyMath.div(numberA, numberB)).isEqualTo(expected);
	}

}
