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
	@Test
	public void test3()
	{
		{
			stringCalculator c=new stringCalculator();
			int expectedvalue=3;
			int actualvalue=c.addString("1,2");	
			assertEquals(expectedvalue,actualvalue);
			}

	}
	@Test
	public void test4()
	{
		{
			stringCalculator c=new stringCalculator();
			int expectedvalue=3;
			int actualvalue=c.addString("1\n2");	
			assertEquals(expectedvalue,actualvalue);
			}

	}
	@Test(expected = IllegalArgumentException.class)
	public void test5()throws Exception
	{
		{
			stringCalculator c=new stringCalculator();
			c.addString("-1,2");
			}

	}
	@Test
	public void test6()
	{
		{
			stringCalculator c=new stringCalculator();
			int expectedvalue=2;
			int actualvalue=c.addString("1001,2");	
			assertEquals(expectedvalue,actualvalue);
			}

	}
}
