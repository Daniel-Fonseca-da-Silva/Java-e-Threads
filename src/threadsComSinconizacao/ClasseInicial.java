package threadsComSinconizacao;

public class ClasseInicial{

	public static void main(String[] args) {
		
		ClasseFinal Sincronizada = new ClasseFinal();
		
		Sincronizada.start(); // Esperando Sincronizada
		
		synchronized(Sincronizada) 
		{
			try
			{
				System.out.println("Esperando Sincronizada carregar...");
				Sincronizada.wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Total foi " + Sincronizada.total);
		

	}
	

}
