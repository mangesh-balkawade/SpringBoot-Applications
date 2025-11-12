package Exception;

// Jar Try madhe exception aal ani parat catch madhe pn exception aal tar exception cha object last 
//mhanje recent exception  mhanjech catch madhal exception throw karto

public class E2 
{
 public static void main(String[] args) 
 {
	try
	{
		int a=10/0;
	}
	catch (Exception e) {
		// TODO: handle exception
		String s=null;
		System.out.println(s.charAt(0));
	}
	finally
	{
		int x=10/0;  // This Exception object will be thrown by compiler i.e Arithamatic Exception
	}
	
}
}
