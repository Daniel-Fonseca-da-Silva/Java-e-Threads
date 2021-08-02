package threadsSeparadasEmTempo;


// Exemplo ExemploThread estende Thread
public class ExemploThread extends Thread
{
	 // Atribudo guarda tempo
	private int tempoSono;
	
	// Construtor
	public ExemploThread(String nome) {
		
		super(nome);
		// Dorme durante 5 a 0 segundos
		tempoSono = (int) (Math.random() * 5000); // Gera Número aleatórios inteiros
		
		System.err.println("Nome: " + getName() + "dormindo: " + tempoSono);
	}
	
	// Metódo run
	
	public void run()
	{
		
		try // Tente
		{
			System.err.println(getName() + "Indo dormi");
			Thread.sleep(tempoSono); // entra no estado not runnable
		}catch(InterruptedException interruptedException)
		{
			System.err.println(interruptedException.toString());
		}
		
		System.err.println(getName() + "Terminou de dormi");
	}
}
