package estendeRunnableThread;

// Classe Principal que estende Thread

public class Principal extends Thread{
	
	public static void main(String args[])
	{
		(new Principal()).start();
	}
	
	public void run()// Metódo run para implementa
	{
		System.out.println("Thread estendida executada pela JVM ou SO");
	}
}
