package tablero.ajedrez;

public class Torre extends Piezas {
	public String color;
	public String posicion;
	
	public Torre(String color,String  posicion) {
		this.color=color;
		this.posicion=posicion;
	}
	@Override
	public String toString() {
		return  color +"-"+ posicion ;
	}
}
