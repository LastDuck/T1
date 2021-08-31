package avion.vuelos;

public class PasajeroVip extends Pasajero {

	@Override
	public String toString() {
		return "PasajeroVip [codigoMembresia=" + codigoMembresia + "]";
	}
	private String codigoMembresia;
	public PasajeroVip(String nombre, String apellido, int edad,String codigoMembresia) {
		super(nombre, apellido, edad);
		this.setCodigoMembresia(codigoMembresia);
		// TODO Auto-generated constructor stub
	}
	public String getCodigoMembresia() {
		return codigoMembresia;
	}
	public void setCodigoMembresia(String codigoMembresia) {
		this.codigoMembresia = codigoMembresia;
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}
	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}
	@Override
	public String getApellido() {
		// TODO Auto-generated method stub
		return super.getApellido();
	}
	@Override
	public void setApellido(String apellido) {
		// TODO Auto-generated method stub
		super.setApellido(apellido);
	}
	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return super.getEdad();
	}
	@Override
	public void setEdad(int edad) {
		// TODO Auto-generated method stub
		super.setEdad(edad);
	}
	

}
