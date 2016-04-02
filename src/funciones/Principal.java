package funciones;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		 ControllerFunciones frame = new ControllerFunciones();
		 frame.setTitle("Funciones");
		 frame.setSize(500, 500);
	 	 frame.setLocationRelativeTo(null); // Center the frame
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		    
	   frame.addFunction(new FuncionSinusoidal(4, 1, 180));
	   
	   FuncionPolinomial polinomio1 = new FuncionPolinomial(-180, 180);
	   polinomio1.addTerm(new FuncionTermino(-0.0005,2));
	   frame.addFunction(polinomio1);
	   
	   FuncionPolinomial polinomio2 = new FuncionPolinomial(-180, 180);
	   polinomio2.addTerm(new FuncionTermino(-0.0005,3));
	   frame.addFunction(polinomio2);
	  
		 frame.addFunction(new FuncionSinusoidal(3, 0.5, -90, -180, 8));

	}

}