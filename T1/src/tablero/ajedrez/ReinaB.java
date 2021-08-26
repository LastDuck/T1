package tablero.ajedrez;

public class ReinaB extends Piezas {

	public String color;
	public String posicion;
	
	public ReinaB(String color,String  posicion) {
		this.color=color;
		this.posicion=posicion;
	}
	@Override
	public String toString() {
		return  color +"-"+ posicion ;
	}
}
