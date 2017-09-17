/**
 * 
 */
package lab1;

//import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author mduran35
 *
 */
public class MyMathTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link lab.MyMath#div(int, int)}.
	 */
	@Test
	public void testDivPass() {
		int expected = 3;
		int actual = MyMath.div(6, 2);
//		assertEquals(expected, actual);
		assertThat(actual).isEqualTo(expected);
	}
	
	@Test
	public void testDivException() {
		try {
			MyMath.div( 6, 0 );
			fail("This shouldn't show up.");
		} catch (ArithmeticException ex) {
			String expected = "Attempt to divide by zero.";
			String actual = ex.getMessage();
//			assertEquals(expected, actual);
			assertThat(actual).isEqualTo(expected);
		}
	}

}
