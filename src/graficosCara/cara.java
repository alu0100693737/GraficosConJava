package graficosCara;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class cara extends JPanel {

	private final Color COLORCARA = Color.ORANGE;
	private final Color COLOROJOS = Color.BLUE;
	private final Color COLORBOCA = Color.RED;
	private final int TAMANOCARA = 200;
	private final int TAMANOOJOS = 30;
	private final int TAMANOXBOCA = 120;
	private final int TAMANOYBOCA = 10;
	private final int MARGENCARA = 10;
	private final int POSXOJOS = 65;
	private final int POSYOJO1 = 55;
	private final int POSYOJO2 = 135;
	
	private final int POSINICIOBOCA = 50;
	private final int POSFINALBOCA = 140;

	public void paintComponent( Graphics g) {
		super.paintComponent( g );
		//cara
		g.setColor( COLORCARA );
		g.fillOval( MARGENCARA, MARGENCARA, TAMANOCARA, TAMANOCARA );
		//ojos
		g.setColor( COLOROJOS );
		g.fillOval( POSYOJO1, POSXOJOS, TAMANOOJOS, TAMANOOJOS );
		g.fillOval( POSYOJO2, POSXOJOS, TAMANOOJOS, TAMANOOJOS );
		//boca
		g.setColor( COLORBOCA );
		g.fillRect( POSINICIOBOCA,POSFINALBOCA,TAMANOXBOCA, TAMANOYBOCA);
	}
}
