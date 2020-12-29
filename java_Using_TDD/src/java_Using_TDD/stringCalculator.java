package java_Using_TDD;

public class stringCalculator 
{
public int addString(String input)
{
	String[] numbers = input.split(",|\n");
	if(input.isEmpty())
	{
		return 0;
	}

	else if(numbers.length>1)
	{
		return result(numbers);
	}
	return stringToInt(input);		
}
private int result(String[] numbers)
{
	int result=0;
	for(String currentNumber:numbers)
	{
		if(stringToInt(currentNumber)>1000)
		{
			continue;
		}
		result += stringToInt(currentNumber);
	}
	return result;
}
public int stringToInt(String input)
{
	int num=Integer.parseInt(input);
	if(num<0)
		throw new IllegalArgumentException("negatives not allowed");
	else
		return num;
}
}


