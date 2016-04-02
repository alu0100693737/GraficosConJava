package funciones;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

import javax.swing.JPanel;

public class VistaFunciones  extends JPanel{
	
	public final double DISTANCIAPIXELES = 1;		// Distancia entre puntos en pixeles.
	public final double ESCALA = 15;				// Escala.
	public final String X = "x";
	public final String Y = "y";
	
	private Polygon graficoAPintar;			// Polígono utilizado para pintar funciones.
	private ArrayList<Funcion> funciones;		// Funciones a pintar
	private int puntoX;						// Coordenada x central
	private int puntoY;						// Coordenada y central.
	private int izquierda;	
	private int derecha;					
	
	public VistaFunciones() {
		graficoAPintar = new Polygon();
		funciones = new ArrayList<Funcion>();
	}
	
	public VistaFunciones(Funcion f) {
		graficoAPintar = new Polygon();
		funciones = new ArrayList<Funcion>();
		getFunciones().add(f);
	}
	
	public void addFunction (Funcion f) {
		getFunciones().add(f);
		repaint();
	}
	
	public Polygon getPoligono() {
		return graficoAPintar;
	}
	
	public int getIzquierda() {
		setIzquierda();
		return izquierda;
	}
	
	public int getDerecha() {
		setDerecha();
		return derecha;
	}
	
	public void setIzquierda() {
		izquierda = (int) ((-this.getWidth() / 2) * 0.85);
	}
	
	public void setDerecha() {
		derecha =  (int) ((this.getWidth() / 2) * 0.85);
	}
	
	/**
	 * Obtiene la coordenada x del centro de ejes luego de recalcular su posición.
	 * @return
	 */
	public int getCoordX() {
		setCoords();
		return puntoX;
		
	}
	public void setCoordX(int coord) {
		puntoX = coord;
	}
	
	/**
	 * Obtiene la coordenada y del centro de ejes luego de recalcular su posición.
	 * @return
	 */
	public int getCoordY() {
		setCoords();
		return puntoY;
	}
	
	public void setCoorY(int coord) {
		puntoY = coord;
	}
	
	private void setCoords() {
		setCoordX(getWidth() / 2);
		setCoorY(getHeight() / 2);
	}
	
	public ArrayList<Funcion> getFunciones() {
		return funciones;
	}
	public void setFuncion(ArrayList<Funcion> functions) {
		funciones = functions;
	}
	
	/**
	 * @param numFuncion a representar
	 */
	public void dibujarFuncion(int numFuncion) {
		graficoAPintar = new Polygon();
		int izquierda;
		int derecha;
		
		if (getFunciones().get(numFuncion).getIzquierda() != null && getFunciones().get(numFuncion).getIzquierda() > getIzquierda())
			izquierda = getFunciones().get(numFuncion).getIzquierda();
		else
			izquierda = getIzquierda();
		
		if (getFunciones().get(numFuncion).getDerecha() != null && getFunciones().get(numFuncion).getDerecha() < getDerecha())
			derecha = getFunciones().get(numFuncion).getDerecha();
		else
			derecha = getDerecha();
		
		for (int i = izquierda; i <= derecha; i += DISTANCIAPIXELES) {
			
			if (getFunciones().size() != 0)
				getPoligono().addPoint((int) (i + getCoordX()), (int) (getCoordY() - getFunciones().get(numFuncion).f(i) * ESCALA));
		}
	}
	
	/**
	 * Pinta los ejes de coordenadas.
	 * @param g
	 */
	private void pintarEjes(Graphics g) {
		g.drawLine((int)(this.getWidth() * 0.05), getCoordY(), (int)(this.getWidth() * 0.95), getCoordY() );
		g.drawLine(getCoordX() , (int)(this.getHeight() * 0.05), getCoordX(), (int)(this.getHeight() * 0.95));
			
		g.drawString(X, (int)(this.getWidth() * 0.96), (int)(getCoordY() * 1.05));
		g.drawString(Y, (int)(getCoordX() * 1.04), (int)(this.getHeight() * 0.04));
	}
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.BLUE);
		pintarEjes(g);
		
		for(int i = 0; i < getFunciones().size(); i++) {
			dibujarFuncion(i);
			g.setColor(Color.RED);
			g.drawPolyline(getPoligono().xpoints, getPoligono().ypoints, getPoligono().npoints);
		}
		
	}
}
