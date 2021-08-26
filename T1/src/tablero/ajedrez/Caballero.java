package tablero.ajedrez;

public class Caballero extends Piezas {

	public String color;
	public String posicion;
	public Caballero(String color,String  posicion) {
		this.color=color;
		this.posicion=posicion;
	}
	@Override
	public String toString() {
		return  color +"-"+ posicion ;
	}
}
