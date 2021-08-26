package ejercicio.matrices;

import java.util.Scanner;

public abstract class MainMatriz1 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		// TODO Auto-generated method stub
//1. Declare una Matriz de [3][4], desarrolle un programa que vaya solicitando  
		System.out.println("Ingrese el valor del numero de filas");
		int LongitudFilas = lector.nextInt();
		System.out.println("Ingrese el valor del numero de columnas");
		int LongitudColumnas = lector.nextInt();
		char A[][] = new char[LongitudFilas][LongitudColumnas];
		for (int fila = 0; fila <LongitudFilas ; fila++) {

			for (int columna = 0; columna <LongitudColumnas ; columna++) {
				System.out.println("Ingrese el valor de la fila: " + fila + " columna: " + columna);
				char n = lector.next().charAt(0);

				A[fila][columna] = n;

			}

		}
		System.out.println("Iniciamos a imprimir la Matriz");
		
			

		for (int fila = 0; fila < LongitudFilas; fila++) {

			for (int columna = 0; columna < LongitudColumnas; columna++) {
				System.out.print( A[fila][columna]+" ");
				
			}
			System.out.println();
			
		}
	}
}
