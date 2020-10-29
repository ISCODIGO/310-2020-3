package cronometro;

import java.time.Duration;
import java.time.Instant;

public class Cronometro {
	private Instant startTime;
	private Instant endTime;
	
	public Cronometro() {
		iniciar();
	}
	
	public void iniciar() {
		startTime = Instant.now();
	}
	
	public void finalizar() {
		endTime = Instant.now();
	}
	
	@Override
	public String toString() {
		return "" + Duration.between(startTime, endTime).toNanos() + " ns";
	}
	
	
}
