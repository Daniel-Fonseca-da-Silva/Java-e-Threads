package threadVSrunnable;

public class Tarefa2 implements Runnable{

	public void run() 
	{
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Implementando interface Runnable");
		}
		
	}

}
