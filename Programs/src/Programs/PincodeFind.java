package Programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PincodeFind 
{
 public static void main(String[] args) throws FileNotFoundException
 {
   Scanner sc=new Scanner(new File("D:\\data.csv"));
   sc.useDelimiter(",");
   while(sc.hasNext())
   {
	   String str=sc.next();
   String arr[]=str.split(" ");
   int pin=0;
   for(String s:arr)
   {
	   if(s.length()==6)
	   {
		   try
		   {
			   pin=Integer.parseInt(s);
		   }
		   catch(Exception e)
		   {
			   continue;
		   }
	   }
   }
   System.out.println(pin);
   }
}
}
