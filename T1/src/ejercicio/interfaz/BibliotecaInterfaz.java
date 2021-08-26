package ejercicio.interfaz;

public interface BibliotecaInterfaz {

	public void registrarCliente(String nombre,String apellido);
	public void IngresarLibro(String libro);
	public void retirarLibro();
	public void ExtenderPlazo(int Aplazar);
	public void devolverLibro();
}
