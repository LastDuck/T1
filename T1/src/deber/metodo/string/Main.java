package deber.metodo.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector=new Scanner(System.in);
		String nombre ,cedula = null ;
		
		Estudiante Persona[]=new Estudiante [5];
		
		int temp=0;
		
		int opcion=0;
		do {
			System.out.println("**   UCE ***");
			System.out.println("1. Ingresar Estudiante");
			System.out.println("2. Buscar Estudiante");
			System.out.println("3. Salir");
			System.out.print("Escoja opcion:");
			opcion=lector.nextInt();
			 if(opcion==1) {
				 lector.nextLine();
				
				 for(int i=0;i<Persona.length;i++) {
					System.out.println("Ingrese nommbre del a Estudiante:");
					nombre=lector.nextLine();
					System.out.print("Ingrese Cedula: ");
					 cedula=lector.nextLine();
					 
					 Persona[i]=new Estudiante(nombre,cedula);
					 
						}
				 
				}else if(opcion==2) {
					lector.nextLine();
					System.out.println("Ingrese cedula del Estudiante: ");
					String cedula1=lector.nextLine();

					 for(int i=0;i<Persona.length;i++) {
						if(cedula1.equals(cedula)) {
							System.out.println("Se ha encontrado");
							break;
						}else {
							System.out.println("no Se ha encontrado");
							break;
						}
					}
			
				}
			
		}while(opcion!=3);
		System.out.println();
		System.out.println("\t<< Adios >>");
				
	}

}
