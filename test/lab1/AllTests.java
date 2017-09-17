package lab1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({MyMathTest.class, ParaConstructorTest.class, ParaInjectionTest.class})
public class AllTests {

}
