package ejercicio.interfaz;

public class ConsultorioMedico implements ConsultorioInterfaz{

	@Override
	public void sacarTurno() {
		// TODO Auto-generated method stub
		System.out.println("Buscar un consultorio Medico");
		System.out.println("Ver horario de atencion");
		System.out.println("Agendar un turno con el medico general");
	}

	@Override
	public void buscarMedico() {
		// TODO Auto-generated method stub
		System.out.println("Buscar especialistas");
		System.out.println("Agendar con especialista");
	}

	@Override
	public void informarMolestias() {
		// TODO Auto-generated method stub
		System.out.println("Informar sobre las molestias al medico");
		
	}

	@Override
	public void escucharDiagnostico() {
		// TODO Auto-generated method stub
		System.out.println("Escuchar el diagnostico medico");
	
	}

	@Override
	public void comprarRecetaMedica() {
		// TODO Auto-generated method stub
		System.out.println("Recibir receta medicar");
		System.out.println("Comprar receta medica en farmacias");
	}

}
