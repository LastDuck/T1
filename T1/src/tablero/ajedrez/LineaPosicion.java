package tablero.ajedrez;

public class LineaPosicion extends Piezas {

	public String posicion;
	public LineaPosicion(String posicion) {
		this.posicion=posicion;
	}
	@Override
	public String toString() {
		return  posicion ;
	}
	
}
