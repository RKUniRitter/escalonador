import java.util.ArrayList;
import java.util.Iterator;

public class FCFS  implements AlgoritmoEscalonamento{

	/*
	 * Lista de processos a serem processados
	 */
	ArrayList<PCB> processos;	
	
	/*
	 * Tempo decorrido da simulação
	 */
	int tempo;
	
	
	/*
	 * Lista de processos admitidos
	 */
	ArrayList<PCB> admitidos;	
	
	
	public FCFS (ArrayList<PCB> p) {
		processos = p;
		tempo = 0;
		admitidos = new ArrayList<PCB>();
	}

	
	public int getRam() {
		int ram = 0;
		Iterator<PCB> it = admitidos.stream().iterator();
		//https://karims.in/java-8-assigning-variable-inside-lambda-foreach-c73720f1860f
		while (it.hasNext())
			ram += it.next().tamanho;
		//System.out.println("Ram: " +ram);
		return ram;
	}
	
	public boolean temRam(PCB p) {
		if (getRam() + p.tamanho <= 10)
			return true;
		else
			return false;
	}
	
	public void printProcessos() {
		admitidos.forEach(p -> System.out.println(p.toString()));
		
	}
	
	
	@Override
	public void run() {

		//while (true) {
		while (tempo <= 10) {
			
			//1. Faz admissão de processos
			for (int i = 0; i<processos.size(); i++) {
				if (temRam(processos.get(i))) {
					System.out.println("Adicionando: " +processos.get(i).toString());
					admitidos.add(processos.get(i));
				} else
					break;
			} //Fim For Admissão
			
			System.out.println("Tempo: " +tempo);
			//printProcessos();
			tempo++;
		} //Fim While true
		
	}

	@Override
	public void printStats() {
		System.out.println("Algoritmo: FCFS");
		System.out.println("Tempo total da simulação: " +tempo);
		
	}
	
}
