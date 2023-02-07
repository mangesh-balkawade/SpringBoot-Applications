package datastructure;

public class BinarySearch
{
  public static void main(String[] args) 
  {
	  
	int arr[]= {1,2,3,10,22,33,44,100};
	
	int start=0,end=arr.length-1,mid=(start+end)/2;
	int noToSearch=2;
	boolean flag=false;
	while(start<end)
	{
		if(arr[mid]==noToSearch)
		{
			flag=true;
			break;
		}
		else if(noToSearch<arr[mid])
		{
			end=mid-1;
		}
		else
		{
			start=mid+1;
		}
		mid=(start+end)/2;
	}
	System.out.println(flag);
  }
}
