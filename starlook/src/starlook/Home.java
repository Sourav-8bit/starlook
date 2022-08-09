package starlook;

public class Home implements Runnable

{
	public void run()
	{
		System.out.println("constrctors used in the object pass in the area");
		
	}

}
class you
{
	public static void main(String args[])
	{
		Home t=new Home();
		Thread th=new Thread(t);
		th.start();
	}
}
