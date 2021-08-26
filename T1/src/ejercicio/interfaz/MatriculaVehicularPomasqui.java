package ejercicio.interfaz;

public class MatriculaVehicularPomasqui implements MatriculaInterfaz {

	@Override
	public void sacarTurno(String Cedula) {
		// TODO Auto-generated method stub
		System.out.println("Ingresar cedula:"+Cedula);
		System.out.println("Ver el mes para la revison tecnica  vehicular");
		System.out.println("ver turnos disponibles");
		System.out.println("Agendar un turno");
	}

	@Override
	public void consultarValorPagar(int pagar) {
		// TODO Auto-generated method stub
		System.out.println("Consulatar multas");
		System.out.println("Consultar impuesto del rodaje");
		System.out.println("consultar pae");
		System.out.println("Consultar valor total a pagar:"+pagar);
	}

	@Override
	public void pasarRevisionTecnica() {
		// TODO Auto-generated method stub
		System.out.println("Entregar el turno");
		System.out.println("Pasar a la revision tecnica vehicular");
		
		
	}

	@Override
	public void recibirCertificado() {
		// TODO Auto-generated method stub
		System.out.println("Aprobar la revision tecnica vehicular");
		
	}

	@Override
	public void retirarMatricula() {
		// TODO Auto-generated method stub
		System.out.println("Entregar el certificado vehicular");
		System.out.println("Entrgar comprobantes de pagos");
		System.out.println("Consultar con base de datos");
		System.out.println("retira la matricula");
		
	}

}
