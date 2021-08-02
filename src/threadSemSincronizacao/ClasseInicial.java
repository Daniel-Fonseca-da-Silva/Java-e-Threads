package threadSemSincronizacao;

public class ClasseInicial{

	public static void main(String[] args) {
		
		ClasseFinal Desincronizada = new ClasseFinal();
		
		Desincronizada.start();
		
		
		System.out.println("Esperando Desincronizada carregar...");
		System.out.println("Total foi " + Desincronizada.total);
		

	}
	

}
