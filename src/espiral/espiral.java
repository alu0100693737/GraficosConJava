package espiral;

import java.awt.Graphics;

import javax.swing.JPanel;

public class espiral extends JPanel {
	private int tamanoPanel;
	private final int TAMANOLINEA = 10;
	
	public void paintComponent( Graphics g) {
		super.paintComponent( g );
		for (int i = 0; i < getTamanoPanel()/2; i+= TAMANOLINEA) {
			g.drawLine(i, i, getTamanoPanel()-1 - i, i);		
			g.drawLine(getTamanoPanel()-1 - i, i, getTamanoPanel()-1 - i, getTamanoPanel()-1 - i);
			g.drawLine(getTamanoPanel()-1 - i, getTamanoPanel()-1 - i, TAMANOLINEA + i, getTamanoPanel()-1 - i);
			g.drawLine(TAMANOLINEA + i, getTamanoPanel()-1 - i, TAMANOLINEA + i, TAMANOLINEA + i);
		}
	}
	
	public espiral(int sizePanel) {
		tamanoPanel = sizePanel;
	}
	
	public int getTamanoPanel() {
		return tamanoPanel;
	}
}
