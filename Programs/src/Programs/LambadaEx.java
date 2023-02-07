package Programs;

interface add
{
	int add(int ino1,int ino2);
}

public class LambadaEx 
{
	public static void main(String[] args) 
	{
		   add lamda=(ino1,ino2)->ino1+ino2;
		   System.out.println(lamda.add(1,2));
	}
	
}
