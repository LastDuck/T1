package avion.vuelos;

public class PasajeroEconomicos extends Pasajero {

	@Override
	public String toString() {
		return "PasajeroEconomicos [codigoDescuento=" + codigoDescuento + "]";
	}
	private String codigoDescuento;
	public PasajeroEconomicos(String nombre, String apellido, int edad,String codigoDescuento) {
		super(nombre, apellido, edad);
		// TODO Auto-generated constructor stub
		this.setCodigoDescuento(codigoDescuento);
	}
	public String getCodigoDescuento() {
		return codigoDescuento;
	}
	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}

}
