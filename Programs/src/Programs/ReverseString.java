package Programs;

public class ReverseString 
{

	static String ReverseString(String str)
	{
		char arr[]=str.toCharArray();
		for(int i=0,j=arr.length-1;i<j;i++,j--)
		{
			char temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
		
		 String s=new String(arr);
		 return s;
		
	}
	
	public static void main(String[] args) 
	{
		String rev=ReverseString("Mangesh");
		System.out.println(rev);
	}
}
