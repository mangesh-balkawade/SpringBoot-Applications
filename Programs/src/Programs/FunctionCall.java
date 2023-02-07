package Programs;

public class FunctionCall
{
	
	public static void change(int arr[])
	{
//		for(int i=0,j=arr.length-1;i<j;i++,j--)
//		{
//			int temp=arr[i];
//			arr[i]=arr[j];
//			arr[j]=temp;
//		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-2;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
public static void main(String[] args) 
{
	
	int arr[]= {1,4,6,3,7,8};
	change(arr);
	
	for (int i = 0; i < arr.length; i++) 
	{
		System.out.println(arr[i]);
	}
	String s="Mangesh Bal  ha";
	String s1=s.replaceAll("[ ]{1,}","");
	System.out.println(s1);
	String s2=null;
	try
	{	if(s2.equals(s1))
		System.out.println("Null poitner exception");
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}
}
