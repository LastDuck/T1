package tablero.ajedrez;

public class ReyB extends Piezas {

	public String color;
	public String posicion;
	
	public ReyB(String color,String  posicion) {
		this.color=color;
		this.posicion=posicion;
	}
	@Override
	public String toString() {
		return  color +"-"+ posicion ;
	}
}

