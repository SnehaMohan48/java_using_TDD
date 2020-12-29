package java_Using_TDD;
import static org.junit.Assert.*;
import org.junit.Test;
public class stringCalculatorTest
{
	@Test
	public void test1()
	{
		{
			stringCalculator c=new stringCalculator();
			int expectedvalue=0;
			int actualvalue=c.addString("");	
			assertEquals(expectedvalue,actualvalue);
			}

	}
	@Test
	public void test2()
	{
		{
			stringCalculator c=new stringCalculator();
			int expectedvalue=1;
			int actualvalue=c.addString("1");	
			assertEquals(expectedvalue,actualvalue);
			}

	}
}
