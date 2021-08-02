package threadVSrunnable;

public class Tarefa1 extends Thread{

	public void run()
	{
		
		for(int i = 0; i < 10; i++)
		{
			int p = this.getPriority();
			System.out.println("Classe Herança Thread - Prioridade = " + p);
			p = i;
			//this.setPriority(p + 1); // 0 + 1 = 1
			this.setPriority(10 - p);
		}
		
	}
	
}

