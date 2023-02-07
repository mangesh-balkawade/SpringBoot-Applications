package Programs;

import java.util.HashMap;
import java.util.Set;

public class CountWordsStringHashMap 
{
  public static void main(String[] args) {
	String str="Hi Mangesh Jaysing Balkawade Mangesh";
	String arr[]=str.split(" ");
	int icnt=0;
	HashMap<String, Integer> map=new HashMap<>();
	for(String s:arr)
	{
		if(map.containsKey(s))
		{
			map.put(s,map.get(s)+1);
		}
		else
		{
			map.put(s, 1);
		}
	}
	Set<String> s=map.keySet();
	for(String str1:s)
	{
		System.out.println("Key is "+str1+" values is "+map.get(str1));
	}
}
}
