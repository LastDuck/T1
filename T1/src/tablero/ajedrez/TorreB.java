package tablero.ajedrez;

public class TorreB extends Piezas {

	public String color;
	public String posicion;
	
	public TorreB(String color,String  posicion) {
		this.color=color;
		this.posicion=posicion;
	}
	@Override
	public String toString() {
		return  color +"-"+ posicion ;
	}
}

