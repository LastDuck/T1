package vectores;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);

		// Declare un Vector X cuya lingitud se solicite al usuario de tipo int
// Y construya un programa que pida al usuario que ingrese los
		// valores de cada posicion
		System.out.println("----Digite el tamaño del Vector-----");
		int n = lector.nextInt();
		int X[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("----Ingrese el valor de la posicion " + i + "-----");
			int m = lector.nextInt();
			
			X[i] = m;
			}
		
		for (int i = 0; i < n; i++) {
			System.out.println("----El valor de la posicion "+ i + " es -----");
			System.out.println(X[i]);
		
		
	}

}
}
