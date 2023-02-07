package Programs;

public class NonRepeatingCharacter
{
 public static void main(String[] args)
 {
	String str="ASDGAS";
	char arr[]=str.toCharArray();
	char nonrepaet='\0';
	boolean flag=true;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			nonrepaet=arr[i];
			break;
		}	
		flag=true;
	}
	System.out.println(nonrepaet);
 } 
}
