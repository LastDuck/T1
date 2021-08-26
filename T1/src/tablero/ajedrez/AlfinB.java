package tablero.ajedrez;

public class AlfinB extends Piezas{

	public String color;
	public String posicion;
	
	public AlfinB(String color,String  posicion) {
		this.color=color;
		this.posicion=posicion;
	}
	@Override
	public String toString() {
		return  color +"-"+ posicion ;
	}
}
