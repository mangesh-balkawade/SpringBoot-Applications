package Programs;

import java.util.HashMap;

public class CountFrequencyElementArray 
{
  public static void main(String[] args) 
  {
	  int arr[]= {1,2,3,1,2,4,5,6,7,4,5,6,8};
	  HashMap<Integer, Integer> map1=new HashMap<>();
	  
	  for (int i = 0; i < arr.length; i++)
	  {
		if(map1.containsKey(arr[i]))
		{
			map1.put(arr[i], map1.get(arr[i])+1);
		}
		else
		{
			map1.put(arr[i], 1);
		}
	 }
	  
	  for(Integer i:map1.keySet())
	  {
		  System.out.println("elements is "+i+" frequency is "+map1.get(i));
	  }
  }
}
