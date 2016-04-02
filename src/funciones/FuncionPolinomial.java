package funciones;

import java.util.ArrayList;

public class FuncionPolinomial extends Funcion{
	
	private ArrayList<FuncionTermino> polinomio;	//Polinomio que defina a la función.
	
	public FuncionPolinomial() {
		super();
		polinomio = new ArrayList<FuncionTermino>();
	}
	
	public ArrayList<FuncionTermino> getPolinomio() {
		return polinomio;
	}
	
	public FuncionPolinomial(Integer izquierda, Integer derecha) {
		super(izquierda, derecha);
		polinomio = new ArrayList<FuncionTermino>();
	}
	
	public void addTerm(FuncionTermino term) {
		getPolinomio().add(term);
	}
	
	@Override
	public double f(double x) {
		double res = 0;
		FuncionTermino aux;
		for (int i = 0; i < polinomio.size(); i++) {
			aux = polinomio.get(i);
			res += aux.getCoeficiente() * Math.pow(x, aux.getGrado());
		}
		return res;
	}
}