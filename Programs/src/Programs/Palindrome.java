package Programs;

public class Palindrome 
{

	static boolean chkPalindrome(String str)
	{
		int i=0,j=0;
		for(i=0,j=str.length()-1;i<j;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				break;
			}
		}
		
		if(i<j)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args)
	{
		boolean bRet=chkPalindrome("ABAB");
		if(bRet==true)
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
	}
}
