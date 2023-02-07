package Programs;

import java.util.HashMap;
import java.util.Set;

public class CountCharacters 
{
	
public static void main(String[] args)
{
	String str="HHAAAANNSSDDfghjjd";
	char arr[]=str.toCharArray();
	HashMap<Character, Integer> countchar=new HashMap<>();
	int icnt=0;
	for (int i = 0; i < arr.length; i++) 
	{
		if(countchar.containsKey(arr[i]))
		{
			countchar.put(arr[i],countchar.get(arr[i])+1);
		}
		else
		{
			countchar.put(arr[i], 1);
		}
	}
	
	Set<Character> set1=countchar.keySet();
	for(Character c:set1)
	{
		System.out.println("CHaracter "+c+" frequency is"+countchar.get(c));
	}
	
}
}
