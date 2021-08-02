package threadSemSincronizacao;

public class ClasseFinal extends Thread{

	int total;
	
	public void run()
	{
		
		for(int i = 0; i < 100; i++)
		{
			
			total += i;
			
		}
		
	}
	
}
