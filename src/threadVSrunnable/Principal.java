package threadVSrunnable;

public class Principal {

	public static void main(String[] args) {
		
		Thread ThreadHeranca = new Tarefa1();
		Thread ThreadRunnable = new Thread(new Tarefa2());
		
		ThreadHeranca.start();
		ThreadRunnable.start();

	}

}
