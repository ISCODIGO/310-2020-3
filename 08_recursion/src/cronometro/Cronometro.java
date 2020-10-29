package cronometro;

import java.time.Duration;
import java.time.Instant;

public class Cronometro {
	private Instant inicio;
	private Instant fin;
	
	public Cronometro() {
		iniciar();
	}
	
	public void iniciar() {
		inicio = Instant.now();
	}
	
	public void finalizar() {
		fin = Instant.now();
	}
	
	@Override
	public String toString() {
		return "" + Duration.between(inicio, fin).toNanos() + " ns";
	}
	
	
}
