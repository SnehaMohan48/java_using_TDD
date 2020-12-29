package java_Using_TDD;

public class stringCalculator 
{
public int addString(String input)
{
	String[] numbers = input.split(",");
	if(input.isEmpty())
	{
		return 0;
	}
	else if(input.length()==1)
	{
	return Integer.parseInt(input);
	}
	else if(numbers.length>1)
	{
		return result(numbers);
	}
	return Integer.parseInt(input);		
}
private int result(String[] numbers)
{
	int result=0;
	for(String currentNumber:numbers)
	{
		result += Integer.parseInt(currentNumber);
	}
	return result;
}
}


