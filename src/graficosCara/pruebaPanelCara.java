package graficosCara;

import javax.swing.JFrame;

public class pruebaPanelCara {
	public static void main(String[] args) {
		
		ventanaCara prueba = new ventanaCara();
		prueba.setTitle("Cara Grafica");
		prueba.setSize(400, 250);
		prueba.setLocationRelativeTo(null); // Center the frame
		prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prueba.setVisible(true);
	}
}
