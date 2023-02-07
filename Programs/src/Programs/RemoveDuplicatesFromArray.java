package Programs;

public class RemoveDuplicatesFromArray 
{
   static void removeDupli(int arr[])
   {
	   for(int i=0;i<arr.length;i++)
	   {
		   for(int j=0;j<arr.length;j++)
		   {
			   if(arr[i]<arr[j])
			   {
				  
				   int temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			   }
		   }
	   }
	   
	   boolean flag=false;
	
	   for(int i=0;i<arr.length-1;i++)
	   {
		   for(int j=i+1;j<arr.length&&arr[i]==arr[j];j++)
		   {
			   flag=true;
			   arr[j]=0;
		   }
		   if(flag==true)
			   arr[i]=0;
		   flag=false;
	   }
   }
   
   public static void main(String[] args) 
   {
	int arr[]= {1,2,3,4,1,2,3,5,6,7};
	removeDupli(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}
}
