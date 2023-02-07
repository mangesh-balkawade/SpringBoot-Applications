package Programs;

import java.util.Set;
import java.util.TreeMap;

//Given a string , which is the company name in lowercase letters, your task is to find the top three most common characters in the string.
//
//Print the three most common characters along with their occurrence count.
//Sort in descending order of occurrence count.
//If the occurrence count is the same, sort the characters in alphabetical order.
//For example, according to the conditions described above,
//
// would have it's logo with the letters .


public class CountCharHackerRank 
{
  public static void main(String[] args)
  {
	String s="GOOGLE";
	char arr[]=s.toCharArray();
	TreeMap<Character,Integer> map=new TreeMap<>();

	for(int i=0;i<arr.length;i++)
	{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i],1);
			}
	}
	
	char max1='\0',max2='\0',max3='\0';
	int icnt1=0,icnt2=0,icnt3=0;
	int temp1=0,temp2=0,temp3=0;
	char ctemp1='\0',ctemp2='\0',ctemp3='\0';
	Set<Character> set=map.keySet();
	boolean flag=true;
	for(Character c:set)
	{
		if(map.get(c)>icnt1)
		{
			temp1=icnt1;
			ctemp1=c;
			icnt1=map.get(c);
			max1=c;
			flag=false;
		}
		if(flag=false || map.get(c)>icnt2)
		{
			if(flag==false)
			{
			 temp2=icnt2;
			 ctemp2=max2;
			 icnt2=temp1;
			 max2=ctemp1;
			}
			else
			{
				 temp3=icnt2;
				 ctemp3=max2;
				 icnt2=map.get(c);
				 max2=c;
			}
			 flag=false;
		}
	
	}
	
	System.out.println(max1+" "+max2+" "+map.get(max1)+" "+map.get(max2));
	
 }
}
