package Programs;

class ThreadDemo extends Thread
{
	public synchronized void run()
	{
		
		System.out.println(Thread.currentThread());
		System.out.println("Hi Mangesh");
		
		
	}
}

public class ThreadEx 
{
public static void main(String[] args) 
{
	ThreadDemo t1=new ThreadDemo();
	ThreadDemo t2=new ThreadDemo();
	t1.start();
	try {
		t1.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	t2.start();
}
}
