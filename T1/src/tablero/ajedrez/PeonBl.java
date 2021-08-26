package tablero.ajedrez;

public class PeonBl extends Piezas {
	public String color;
	public String posicio;
	public PeonBl(String color,String  posicion) {
		this.color=color;
		this.posicio=posicion;
		
	}
	@Override
	public String toString() {
		return  color +"-"+ posicio ;
	}
	
}
