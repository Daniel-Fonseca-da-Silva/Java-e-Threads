package threadsSeparadasEmTempo;

public class Principal extends Thread
{

	public static void main(String[] args) 
	{
		// Instância 4 threads
		ExemploThread thread1, thread2, thread3, thread4;
		// Inicializa 4 threads;
		thread1 = new ExemploThread("Thread 1 ");
		thread2 = new ExemploThread("Thread 2 ");
		thread3 = new ExemploThread("Thread 3 ");
		thread4 = new ExemploThread("Thread 4 ");
		
		System.err.println("\nIniciando as threas");
		
		// Inicia as 4 Threads
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		System.err.println("\nThreads iniciadas\n");
	}

}
