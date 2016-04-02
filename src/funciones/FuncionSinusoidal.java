package funciones;

public class FuncionSinusoidal extends Funcion {
	private double a;		// Amplitud
	private double w;		// Velocidad angular
	private double phi;		// Fase
	
	public FuncionSinusoidal(double ampl, double velocidadAngular, double fase) {
		super();
		a = ampl;
		w = velocidadAngular;
		phi = fase;
	}
	
	public FuncionSinusoidal(double ampl, double velocidadAngular, double fase, Integer izquierda, Integer derecha) {
		super(izquierda, derecha);
		a = ampl;
		w = velocidadAngular;
		phi = fase;
	}
	@Override
	public double f(double x) {
		return a * Math.sin(Math.toRadians((w * x + phi)));
	}

}