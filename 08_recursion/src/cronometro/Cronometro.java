package cronometro;

import java.time.Duration;
import java.time.Instant;

public class Cronometro {
	private long inicio;
	private long fin;
	
	public Cronometro() {
		iniciar();
	}
	
	public void iniciar() {
		inicio = System.nanoTime();
	}
	
	public void finalizar() {
		fin = System.nanoTime();
	}
	
	@Override
	public String toString() {
		long nanos = fin - inicio;
		return String.format("%d ns", nanos);
	}
	
	
}
