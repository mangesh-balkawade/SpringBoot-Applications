package basic;

import java.io.FileNotFoundException;

public class ExceptionX 
{
public static void main(String[] args) throws FileNotFoundException 
{
	//3
	System.out.println(fun());
	throw new FileNotFoundException();
}

static int fun()
{
	int i=1;
	try
	{
		throw new Exception();
	}
	catch(Exception e)
	{
		i=2;
		//System.out.println(i);
		return i;
	}
	finally
	{
		i=3;
		System.out.println(i);
		return i;
		// Return From finally 
	}
	// There should be only one finally block have after try ..
//	finally
//	{
//		
//	}
}
}
