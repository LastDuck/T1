package cajero.automatico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner lector=new Scanner(System.in);
		int opcion=0;
		
		System.out.println("**Banco del Pichincha seleccione una opción***");
		System.out.println("1. Retirar dinero");
		System.out.println("2. Cambiar de clave");
		System.out.println("3. Bloquear cuenta");
		System.out.println("4. SALIR");
		System.out.print("Escoja opcion:");
		opcion=lector.nextInt();
	while (opcion!=4) {
					
			
			 if(opcion==1) {
					System.out.print("Ingrese valor a retirar:");
					int v=lector.nextInt();
					System.out.println("El valor a retirar es:"+v);
					
					
				}else if(opcion==2) {
					System.out.println("“Ingrese nueva clave:”");
					lector.nextLine();
					String CN=lector.nextLine();
					
					System.out.println("“Su clave ha sido cambiada”");
				}else if(opcion==3) {
					System.out.println("“Su cuenta ha sido bloqueada”");
				}
			 
				System.out.println("**Banco del Pichincha seleccione una opción***");
				System.out.println("1. Retirar dinero");
				System.out.println("2. Cambiar de clave");
				System.out.println("3. Bloquear cuenta");
				System.out.println("4. SALIR");
				System.out.print("Escoja opcion:");
				opcion=lector.nextInt();
		}
	System.out.println();
	System.out.println("\t<< Gracias por visitarmos >>");
		
	}

}
