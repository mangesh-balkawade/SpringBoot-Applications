package hello;

import java.util.Scanner;

class Solution
{
	public int sumDigitNumber(int ino)
	{
		int iSum=0,iDigit=0;
		while(ino>0)
		{
			iDigit=ino%10;
			iSum=iSum+iDigit;
			ino=ino/10;
		}
		return iSum;
	}
}

public class Tester
{
  public static void main(String[] args) 
  {
	  
	Scanner sobj =new Scanner(System.in);
	Integer iNo1=sobj.nextInt();
	
	Solution solution=new Solution();
	
	int iRet=0;
	iRet=solution.sumDigitNumber(iNo1);
	System.out.println("The Sum Of Digit Of No is "+iRet);
	
  }
}


//public void chkNumber(int ino)
//{
//	if((ino%11==0) && (ino%17==0))
//	{
//		System.out.println("Foo Bar");
//	}
//	else if(ino%11==0)
//	{
//		System.out.println("Foo");
//	}
//	else if(ino%17==0)
//	{
//		System.out.println("Bar");
//	}
//}

//public void swapNumbers(int iNo1,int iNo2)
//{
//	iNo1=iNo1+iNo2;
//	iNo2=iNo1-iNo2;
//	iNo1=iNo1-iNo2;
//	
//	System.out.println("First After Swapping is "+iNo1+" Second No After Swapping is "+iNo2);
//}
