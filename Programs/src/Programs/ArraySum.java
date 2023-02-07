package Programs;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.Scanner;

public class ArraySum 
{
  public static void main(String[] args) 
  {
	 Scanner sc=new Scanner(System.in);
	 Integer integer1=sc.nextInt();
	 String c=sc.nextLine();
	 String  input=sc.nextLine();
	 long isum=0;
	 
	 String arr[]=input.split(" ");
	 for (int i = 0; i < arr.length; i++) 
	 {
		Integer iNo=Integer.parseInt(arr[i]);
		isum=isum+iNo;
	 }
	 
	 System.out.println(isum);
}
}
