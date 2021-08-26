package tablero.ajedrez;

public class Rey extends Piezas {
	public String color;
	public String posicion;
	
	public Rey(String color,String  posicion) {
		this.color=color;
		this.posicion=posicion;
	}
	@Override
	public String toString() {
		return  color +"-"+ posicion ;
	}
}
