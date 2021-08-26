package ejercicio.interfaz;

public class BibliotecaCentral  implements BibliotecaInterfaz{

	@Override
	public void registrarCliente(String nombre, String apellido) {
		// TODO Auto-generated method stub
		System.out.println("Nombre del cliente:"+nombre);
		System.out.println("Apellido del cliente:"+apellido);
	}

	@Override
	public void IngresarLibro(String libro) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el libro a buscar:"+libro);
		
	}

	@Override
	public void retirarLibro() {
		// TODO Auto-generated method stub
	
		System.out.println("Ver si el libro esta disponible");
		System.out.println("Ver fecha y hora de entrega");
	}

	@Override
	public void ExtenderPlazo(int Aplazar) {
		// TODO Auto-generated method stub
		System.out.println("Pedir extension del libro a la biblioteca");
		System.out.println("Tiempo de extendion del libro:"+Aplazar);
	}

	@Override
	public void devolverLibro() {
		// TODO Auto-generated method stub
		System.out.println("Entegar el libro a la biblioteca");
		System.out.println("Ver estado del libro devuelto");
	}

}
