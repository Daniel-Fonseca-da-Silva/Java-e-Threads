package implementaRunnableThread;

// classe implementando Runnable
public class Principal implements Runnable{
	
	public static void main(String args[])
	{
		(new Thread(new Principal())).start();
		
	}
	
	public void run()// Obrigatório implementa o metódo run
	{
		System.out.println("Thread com interface Runnable foi executada pela JVM ou SO");
	}
	
}
