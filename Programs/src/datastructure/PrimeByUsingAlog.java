package datastructure;

import java.util.Arrays;

public class PrimeByUsingAlog
{
 public static void main(String[] args)
 {
   boolean arr[]=new boolean[101];
   Arrays.fill(arr, true);
   
   for(int i=2;i*i<=100;i++)
   {
	   for(int j=2*i;j<=100;j=j+i)
	   {
		   arr[j]=false;
	   }
   }
   
   for (int i = 1; i < arr.length; i++) {
	System.out.println("no is "+ i+" prime or not "+arr[i]);
}
}
}
