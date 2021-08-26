package vectores;

import java.util.Scanner;

public class MainVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Declarar un Vector de longitud 3 de tipo char

		Scanner lector = new Scanner(System.in);
		char X[] = new char[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("----Ingrese el valor de la posicion " + i + "-----");
			char n = lector.next().charAt(0);

			X[i] = n;
			}
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("----El valor de la posicion "+ i + " es -----");
			System.out.println(X[i]);
		
		}
	}
	}


