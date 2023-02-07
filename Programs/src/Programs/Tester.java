package Programs;

class ArrayX
{
	public int addition(int arr[])
	{
		int iSum=0;
		for (int i = 0; i < arr.length; i++) {
		 iSum=iSum+arr[i];
		}
		return iSum;
	}
}

public class Tester {
public static void main(String[] args) {
//	Mathx mathx =new Mathx();
//	int iRet=0;
//	iRet=mathx.addition(1, 3);
//	
//	System.out.println("Addition of two numbers are "+ iRet);
//	
////	int[] arr1=new int[2];
//	int arr1[]= {1,2,3,4,5};
//	ArrayX arrayXObj=new ArrayX();
//	iRet=arrayXObj.addition(arr1);
//	System.out.println(iRet);
	
	String s1="Mangesh";
	String s2=s1;
	s1=s1.toUpperCase();
	System.out.println(s1==s2);
	String s=new String("Mangesh");
	System.out.println(s2==s);
	
}
}
