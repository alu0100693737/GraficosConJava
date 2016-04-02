package espiral;

import javax.swing.JFrame;

import com.sun.javafx.geom.Vec2d;

public class PrincipalEspiral {
	public static void main(String[] args) {
		ventanaEscalera prueba = new ventanaEscalera();
		prueba.setTitle("Espiral");
		prueba.setSize(500, 500);
		prueba.setLocationRelativeTo(null); // Center the frame
		prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prueba.setVisible(true);
	}

}
