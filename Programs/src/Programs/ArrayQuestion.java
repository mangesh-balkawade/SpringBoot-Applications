package Programs;

public class ArrayQuestion 
{
public static void main(String[] args) 
{
	int arr[]= {2,4,1,3,4,5,6,8,9};
	
	int isum=10;
//	
//	for(int i=0;i<arr.length;i++)
//	{
//		for(int j=i+1;j<arr.length;j++)
//		{
//			if(arr[i]+arr[j]>isum)
//			{
//				isum=arr[i]+arr[j];
//			}
//		}
//	}
	
//	System.out.println(isum);
	
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]+arr[j]==isum)
			{
				System.out.println("first no is "+arr[i]+" Second no is "+arr[j]);	
			}
		}
	}
	
}
}
