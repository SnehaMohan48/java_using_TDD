package java_Using_TDD;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
public class stringCalculatorTest
{
	
	private stringCalculator c;
	@Before
	public void initialize() {
		c = new stringCalculator();
	}
	@Test
	public void emptyInputCase()
	{
		{
			
			int expectedvalue=0;
			int actualvalue=c.addString("");	
			assertEquals(expectedvalue,actualvalue);
			}

	}
	@Test
	public void singleInputCase()
	{
		{
			int expectedvalue=1;
			int actualvalue=c.addString("1");	
			assertEquals(expectedvalue,actualvalue);
			}

	}
	@Test
	public void twoInputsCase()
	{
		{
			int expectedvalue=3;
			int actualvalue=c.addString("1,2");	
			assertEquals(expectedvalue,actualvalue);
			}

	}
	@Test
	public void multipleInputsCase()
	{
		{
			int expectedvalue=6;
			int actualvalue=c.addString("1,2,3");	
			assertEquals(expectedvalue,actualvalue);
			}

	}
	@Test
	public void newLineDelimiterCase()
	{
		{
			int expectedvalue=3;
			int actualvalue=c.addString("1\n2");	
			assertEquals(expectedvalue,actualvalue);
			}

	}
	@Test(expected = IllegalArgumentException.class)
	public void negativeInputCase()throws Exception
	{
		{
			c.addString("-1,2");
			}

	}
	@Test
	public void ignoreValuesGreaterThan1000()
	{
		{
			int expectedvalue=2;
			int actualvalue=c.addString("1001,2");	
			assertEquals(expectedvalue,actualvalue);
			}

	}
}
