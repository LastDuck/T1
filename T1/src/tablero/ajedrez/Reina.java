package tablero.ajedrez;

public class Reina extends Piezas{
	public String color;
	public String posicion;
	
	public Reina(String color,String  posicion) {
		this.color=color;
		this.posicion=posicion;
	}
	@Override
	public String toString() {
		return  color +"-"+ posicion ;
	}
}
