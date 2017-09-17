package lab1;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

// this is going to be a parameterized test class for MyMath.div() using field injection

@RunWith(value = Parameterized.class)
public class ParaInjectionTest {
	
	
	@Parameter(value = 0)
	public int numberA;
	
	@Parameter(value = 1)
	public int numberB;
	
	@Parameter(value = 2)
	public int expected;
	
	
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
