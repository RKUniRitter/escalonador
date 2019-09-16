
public class PCB {

	int pid;		// PID
	char estado;	// E, P, B, T
	int tamanho;	// tamanho em MB; máquina só tem 10 MB
	int io_percent; // 
	int t_execucao;
	int t_admissao;
	int t_espera;
	int t_termino; 
	int t_bloqueio;
	int t_falta;
	
	
	public PCB (int p, int t, int io, int e) {
		pid = p;
		estado = 'P';
		tamanho = t;
		io_percent = io;
		t_execucao = e;
		t_admissao = 0;
		t_espera = 0;
		t_termino = 0;
		t_bloqueio = 0;
		t_falta = e;
	}
	
	
	public String toString() {
		return pid + ", " +estado + ", " +tamanho + ", " + io_percent + ", " +
			   t_execucao + ", " + t_admissao + ", " + t_espera + ", " + t_termino + ", " +
			   t_bloqueio + ", " +t_falta;
	}
}
