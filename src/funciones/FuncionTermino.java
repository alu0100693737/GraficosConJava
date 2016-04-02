package funciones;

public class FuncionTermino {
	private int grado;		
	private double coeficiente;	
	
	public FuncionTermino(double coef, int grad) {
		grado = grad;
		coeficiente = coef;
	}
	
	public int getGrado() {
		return grado;
	}
	
	public double getCoeficiente() {
		return coeficiente;
	}
}
