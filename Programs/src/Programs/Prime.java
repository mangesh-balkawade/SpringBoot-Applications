package Programs;

import java.util.ArrayList;
import java.util.List;

public class Prime 
{

	static boolean chkPrime(int ino)
	{
		if(ino==1||ino==2)
			return false;
		int i=0;
		for( i=2;i<=ino/2;i++)
		{
			if(ino%i==0)
				break;
		}
		if(i<=(ino/2))
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) 
	{
		boolean bret=chkPrime(17);
		if(bret==true)
			System.out.println("No is Prime");
		else
			System.out.println("No is not Prime");
		
		
		
	}
}
