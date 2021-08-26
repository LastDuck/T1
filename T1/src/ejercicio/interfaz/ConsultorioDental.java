package ejercicio.interfaz;

public class ConsultorioDental implements ConsultorioInterfaz {

	@Override
	public void sacarTurno() {
		// TODO Auto-generated method stub
		System.out.println("Buscar un consultorio Dental");
		System.out.println("Ver horario de atencion");
		System.out.println("Agendar un turno ");
	}

	@Override
	public void buscarMedico() {
		// TODO Auto-generated method stub
		
		System.out.println("Buscar Odontologo");
		System.out.println("Entregar turno ");
		
	}

	@Override
	public void informarMolestias() {
		// TODO Auto-generated method stub
		System.out.println("Informar sobre las molestias ");
		
		
	}

	@Override
	public void escucharDiagnostico() {
		// TODO Auto-generated method stub
		System.out.println("Escuchar el diagnostico medico");
		System.out.println("Informar sobre tratamientos al paciente");
		
	}

	@Override
	public void comprarRecetaMedica() {
		// TODO Auto-generated method stub
		System.out.println("Recibir receta medicar");
		System.out.println("Comprar receta medica en farmacias");
	}

}
