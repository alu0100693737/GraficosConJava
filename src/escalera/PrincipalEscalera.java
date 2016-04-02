package escalera;

import javax.swing.JFrame;

import graficosCara.ventanaCara;

public class PrincipalEscalera {
	public static void main(String[] args) {
		ventanaEscalera prueba = new ventanaEscalera();
		prueba.setTitle("Escalera");
		prueba.setSize(300, 300);
		prueba.setLocationRelativeTo(null); // Center the frame
		prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prueba.setVisible(true);
	}

}
