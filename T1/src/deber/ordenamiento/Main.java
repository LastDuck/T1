package deber.ordenamiento;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado danilo = new Empleado();
		danilo.setNombre("Danilo");
		danilo.setApellido("Alvarracin");
		danilo.setEdad(22);
		danilo.setSalario(800.45);
		
		Empleado andres = new Empleado();
		andres.setNombre("Andres");
		andres.setApellido("Perez");
		andres.setEdad(21);
		andres.setSalario(420.6);
		
		Empleado alex = new Empleado();
		alex.setNombre("Alex");
		alex.setApellido("Yanez");
		alex.setEdad(23);
		alex.setSalario(410.36);
		
		Empleado Karla = new Empleado();
		Karla.setNombre("Karla");
		Karla.setApellido("Cruz");
		Karla.setEdad(19);
		Karla.setSalario(490.36);
		
		Empleado Pablo = new Empleado();
		Pablo.setNombre("Pablo");
		Pablo.setApellido("Velez");
		Pablo.setEdad(18);
		Pablo.setSalario(398.45);
		
		Empleado Juan = new Empleado();
		Juan.setNombre("Juan");
		Juan.setApellido("Alvarez");
		Juan.setEdad(28);
		Juan.setSalario(510.75);
		
		Empleado Maria = new Empleado();
		Maria.setNombre("Maria");
		Maria.setApellido("Torres");
		Maria.setEdad(27);
		Maria.setSalario(710.75);
		
		Empleado Sol = new Empleado();
		Sol.setNombre("Sol");
		Sol.setApellido("Camposantos");
		Sol.setEdad(24);
		Sol.setSalario(610.75);
		
		Empleado Mercy = new Empleado();
		Mercy.setNombre("Mercy");
		Mercy.setApellido("Cammas");
		Mercy.setEdad(25);
		Mercy.setSalario(430.75);
		
		Empleado Mateo = new Empleado();
		Mateo.setNombre("Mateo");
		Mateo.setApellido("Andrade");
		Mateo.setEdad(23);
		Mateo.setSalario(630.75);
		
		Empleado listaEmpleados[] = new Empleado[10];
		listaEmpleados[0] = danilo;
		listaEmpleados[1] = andres;
		listaEmpleados[2] = alex;
		listaEmpleados[3] = Karla;
		listaEmpleados[4] = Pablo;
		listaEmpleados[5] = Juan;
		listaEmpleados[6] = Maria;
		listaEmpleados[7] = Sol;
		listaEmpleados[8] = Mercy;
		listaEmpleados[9] = Mateo;
		
		//Vector antes de ordenar
		
				System.out.println("\n\t\tEmpleados antes de ordenar");
				System.out.println(Arrays.toString(listaEmpleados));
				//Aqui ordeno la lista
				
				Arrays.sort(listaEmpleados);
				
				System.out.println("\n\t\t >>Nominda de pago<<<");
				
				System.out.println(Arrays.toString(listaEmpleados));
		
		
	}

}
