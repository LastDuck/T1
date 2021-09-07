package deber.metodo.string;

public class Estudiante {

	private String nombre;
	private String cedula;
	
	public Estudiante(String nombre,String cedula){
		this.nombre=nombre;
		this.cedula=cedula;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nCedula: " + cedula + "]";
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
}
