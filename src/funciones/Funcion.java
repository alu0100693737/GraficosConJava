package funciones;


	public abstract class Funcion {
		
		private Integer minimo;	
		private Integer maximo;	
		
		/**
		 * limites infinitos*/
		public Funcion() {
			minimo = null;
			maximo = null;
		}

		/**
		 * Funciones entre rangos
		 * @param left 
		 * @param right
		 */
		public Funcion(Integer izquierda, Integer derecha) {
			minimo = izquierda;
			maximo = derecha;
		}
		
		public Integer getIzquierda() {
			return minimo;
		}
		
		public void setIzquierda(Integer izquierda) {
			minimo = izquierda;
		}
		public Integer getDerecha() {
			return maximo;
		}
		public void setDerecha(Integer derecha) {
			maximo = derecha;
		}
		
		/**
		 * Retorna el valor en y de la funcion
		 */
		public abstract double f(double x);
	}


