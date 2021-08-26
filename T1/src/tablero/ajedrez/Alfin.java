package tablero.ajedrez;

public class Alfin extends Piezas {
	public String color;
	public String posicion;
	
	public Alfin(String color,String  posicion) {
		this.color=color;
		this.posicion=posicion;
	}
	@Override
	public String toString() {
		return  color +"-"+ posicion ;
	}
}
