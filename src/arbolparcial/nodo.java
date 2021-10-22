package arbolparcial;

public class nodo {
	nodo hijozquierdo, hijoderecho;
	int dato;
	
	public nodo(int dato) {
		this.hijozquierdo = null;
		this.hijoderecho = null;
		this.dato = dato;
	}
  
	@Override
	public String toString() {
		return "nodo [hijozquierdo=" + hijozquierdo + ", hijoderecho=" + hijoderecho + ", dato=" + dato + "]";
	}
	 
	

}
