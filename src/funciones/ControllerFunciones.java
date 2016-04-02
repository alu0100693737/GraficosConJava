package funciones;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;

public class ControllerFunciones extends JFrame{
		private VistaFunciones panelFunciones;
		private ArrayList<Funcion> funciones;
		private final Color COLORPANEL = new Color(255, 252, 124);
		public ControllerFunciones() {
			funciones = new ArrayList<Funcion>();
			panelFunciones = new VistaFunciones();
			setBackground(COLORPANEL);
			add(getPanelFunciones());
		}
		
		public VistaFunciones getPanelFunciones() {
			return panelFunciones;
		}
		
		public ArrayList<Funcion> getFunciones() {
			return funciones;
		}
		
		public void addFunction(Funcion newFunction) {
			getFunciones().add(newFunction);
			getPanelFunciones().setFuncion(getFunciones());
		}
}
