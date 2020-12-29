package java_Using_TDD;
import java.util.Scanner;

public class stringCalculator 
{
public int addString(String input)
{
	if(input.isEmpty())
	{
		return 0;
	}
	return Integer.parseInt(input);
		
}
public static void main(String[] args)
{
	stringCalculator strcalc = new stringCalculator();
	int result;
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	result=strcalc.addString(str);
}
}

