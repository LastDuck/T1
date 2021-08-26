package tablero.ajedrez;

public class Peon extends Piezas {

	public String color;
	public String posicio;
	public Peon(String color,String  posicion) {
		this.color=color;
		this.posicio=posicion;
		
	}
	@Override
	public String toString() {
		return  color +"-"+ posicio ;
	}
	
}
