package escalera;

import java.awt.Graphics;
import javax.swing.JPanel;

public class escalera extends JPanel {
	private int tamanoPanel;
	private final int TAMANOLINEA = 10;
	public void paintComponent( Graphics g) {
		super.paintComponent( g );
		//Pintamos horizontal de 0 a i y vertical de 10 en 10 en el limite 
		for (int i = 0; i < getTamanoPanel(); i+=TAMANOLINEA) {
			g.drawLine(0, i, i , i);
			g.drawLine(i, i, i,i + TAMANOLINEA);
		}
	}
	
	public escalera(int sizePanel) {
		tamanoPanel = sizePanel;
	}
	
	public int getTamanoPanel() {
		return tamanoPanel;
	}
}
