package as;

import java.util.Arrays;
import java.util.Scanner;

public class lolol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GRUPO 1
//		Integrantes
//			-Salom? Jim?nez
//			-Darly Castillo
//			-Cristian Chulca

//			Desarrollar un programa, que solicite al usuario ingresar el n?mero de la longitud de un vector de enteros (int), 
//			a partir de este n?mero, crear un vector con dicha longitud; el programa deber? solicitar al usuario que ingrese 
//			un n?mero entero para cada posici?n del vector; luego de que se termine de ingresar los valores de todas las posiciones,
//			el programa deber? realizar un ordenamiento (de acuerdo con el m?todo asignado por grupo) del vector en funci?n
//			de sus valores ingresados.

			// Teclado
			
		Scanner teclado = new Scanner(System.in);                   // El usuario digita la longitud del vector.
		System.out.print("Ingrese la longuitud del vector:");
		int longitud = teclado.nextInt();
		
		int vectorGrupo1[] = new int[longitud];                  	// Declaramos el Vector en un bucle  
			
		for (int fila = 0; fila < longitud; fila++) {
				System.out.print("A["+fila+"]= ");                 // Me imprime el n?mero de posiciones
				int numN = teclado.nextInt();
				vectorGrupo1[fila] = numN;
			}

			for (int fila = 0; fila < longitud; fila++) {
				System.out.print("[" + vectorGrupo1[fila] + "]" + " ");

			}
			System.out.println();
			for (int fila = 0; fila <longitud ; fila++) {
				quicksort(vectorGrupo1, vectorGrupo1.length - 1, 0);
				System.out.print("[" + vectorGrupo1[fila] + "]" + " ");
			}
			System.out.println();
			System.out.println("Ordenamiento de java");
			Arrays.sort(vectorGrupo1);
			System.out.println("El vector antes de ordenador :"+Arrays.toString(vectorGrupo1));
			System.out.println("El vector despues de ordenador :"+Arrays.toString(vectorGrupo1));
		}


		
	private static int colocacion(int vectorGrupo1[], int derecha,int izquierda) {
			int pivote = vectorGrupo1[izquierda];
			while (true) {
				while (vectorGrupo1[izquierda] < pivote) {
					izquierda++;
				}
				while (vectorGrupo1[derecha] > pivote) {
					derecha--;
				}

				if (izquierda >= derecha) {
					return derecha;
				} else {

					int colocamiento = vectorGrupo1[izquierda];
					vectorGrupo1[izquierda] = vectorGrupo1[derecha];
					vectorGrupo1[derecha] = colocamiento;

					izquierda++;
					derecha--;
				}
			}
		}

		private static void quicksort(int vectorGrupo1[], int derecha,int izquierda) {
			if (izquierda < derecha) {
				int orden = colocacion(vectorGrupo1, derecha, izquierda);
				quicksort(vectorGrupo1, izquierda, orden);
				quicksort(vectorGrupo1, orden -1, derecha);
			}

		}

	}
	
