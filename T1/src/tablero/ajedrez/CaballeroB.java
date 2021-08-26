package tablero.ajedrez;

public class CaballeroB extends Piezas {
	public String color;
	public String posicion;
	public CaballeroB(String color,String  posicion) {
		this.color=color;
		this.posicion=posicion;
	}
	@Override
	public String toString() {
		return  color +"-"+ posicion ;
	}
}
