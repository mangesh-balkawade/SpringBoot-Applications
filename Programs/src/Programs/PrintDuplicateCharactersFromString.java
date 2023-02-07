package Programs;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharactersFromString 
{
 public static void main(String[] args) 
 {
	 String str="AAssddefg";
	 
	 Map<Character, Integer> map1=new HashMap<>();
	 
	 for(Character c:str.toCharArray())
	 {
		 if(map1.containsKey(c))
		 {
			 map1.put(c,map1.get(c)+1);
		 }
		 else
		 {
			 map1.put(c,1);
		 }
	 }
	 
	 for(Character c:map1.keySet())
	 {
		 if(map1.get(c)>1)
		 {
			 System.out.println("Character is "+c+" no of times it is present is "+map1.get(c));
		 }
	 }
}
}
