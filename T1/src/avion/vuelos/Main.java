package avion.vuelos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PasajeroEconomicos PE1=new PasajeroEconomicos("PE1","Alva",25,"5465daw4");
		PasajeroEconomicos PE2=new PasajeroEconomicos("PE2","yunga",28,"dsfsdfds");
		PasajeroEconomicos PE3=new PasajeroEconomicos("PE3","perez",24,"5465dawfdfs4");
		PasajeroEconomicos PE4=new PasajeroEconomicos("PE4","casas",21,"54dfre65daw4");
		PasajeroEconomicos PE5=new PasajeroEconomicos("PE5","cruz",23,"546fs5daw4");
		PasajeroEconomicos PE6=new PasajeroEconomicos("PE6","andrago",29,"54fds65daw4");
		PasajeroEconomicos PE7=new PasajeroEconomicos("PE7","andrade",28,"5fds465daw4");
		PasajeroEconomicos PE8=new PasajeroEconomicos("PE8","Dominguez",21,"5fds465daw4");
		PasajeroEconomicos PE9=new PasajeroEconomicos("PE9","Tigre",22,"54fsdf65daw4");
		PasajeroEconomicos PE10=new PasajeroEconomicos("PE10","yanez",25,"5fdsf465daw4");
		
		PasajeroVip PV1=new PasajeroVip("PV1","Alvarraez",18,"dasddasdaasjasd");
		PasajeroVip PV2=new PasajeroVip("PV2","Tomas",19,"asddasdasjasd");
		PasajeroVip PV3=new PasajeroVip("PV3","Juanez",28,"fdsfddasdasjasd");
		PasajeroVip PV4=new PasajeroVip("PV4","Alforja",25,"hfdasdasjasd");
		PasajeroVip PV5=new PasajeroVip("PV5","Jadiera",58,"dfdasdasjasd");
		PasajeroVip PV6=new PasajeroVip("PV6","Almendariz",38,"fddasdasjasd");
		PasajeroVip PV7=new PasajeroVip("PV7","Alvarracin",19,"fddasdasjasd");
		PasajeroVip PV8=new PasajeroVip("PV8","Flores",48,"dfddasdasjasd");
		PasajeroVip PV9=new PasajeroVip("PV9","Carpio",28,"dgrrgasdasjasd");
		PasajeroVip PV10=new PasajeroVip("PV10","DelaCruz",25,"gfdsdasdasjasd");
		
		Pasajero [][] Asientos=new Pasajero[4][5];
		
		Asientos[0][0]=PV1;
		Asientos[0][1]=PV2;
		Asientos[0][2]=PV3;
		Asientos[0][3]=PV4;
		Asientos[0][4]=PV5;
		
		Asientos[3][0]=PV6;
		Asientos[3][1]=PV7;
		Asientos[3][2]=PV8;
		Asientos[3][3]=PV8;
		Asientos[3][3]=PV10;
		
		Asientos[1][0]=PE1;
		Asientos[1][1]=PE2;
		Asientos[1][2]=PE3;
		Asientos[1][3]=PE4;
		Asientos[1][4]=PE5;
		
		Asientos[2][0]=PE6;
		Asientos[2][1]=PE7;
		Asientos[2][2]=PE8;
		Asientos[2][3]=PE9;
		Asientos[2][4]=PE10;
		for(int i=0;i<Asientos.length;i++) {
			for(int j = 0; j < Asientos[i].length; j++){ 
			
				int fila,columna;
				Scanner lector=new Scanner(System.in);
				System.out.println("Ingrese la fila y columna del pasajero");
				System.out.println("fila:");
				fila=lector.nextInt();
				
				System.out.println("columna:");
				columna=lector.nextInt();
				System.out.println(Asientos[fila][columna]);
				
				
				System.out.print("\t"+Asientos[i][j] + "");
				
			}
		
			System.out.println();
			System.out.println();	
		}
		System.out.println("\t --------------------------------");
		
		
		
	}

}
