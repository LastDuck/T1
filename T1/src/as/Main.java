package as;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);                   // El usuario digita la longitud del vector.
		System.out.print("Ingrese la longuitud del vector:");
		int longitud = teclado.nextInt();
		
		 int A[] = new int[longitud];                  	// Declaramos el Vector en un bucle  
			
		for (int fila = 0; fila < longitud; fila++) {
				System.out.print("A["+fila+"]= ");                 // Me imprime el número de posiciones
				int numN = teclado.nextInt();
				 A[fila] = numN;
			}

			for (int fila = 0; fila < longitud; fila++) {
				System.out.print("[" + A[fila] + "]" + " ");

			}
			System.out.println();
			for (int fila = 0; fila <longitud ; fila++) {
				quicksort(A, A.length - 1, 0);
				System.out.print("[" +  A[fila] + "]" + " ");
			}
		}
	

		static void quicksort(int A[], int izq, int der) {

			  int pivote=A[izq]; // tomamos primer elemento como pivote
			  int i=izq;         // i realiza la búsqueda de izquierda a derecha
			  int j=der;         // j realiza la búsqueda de derecha a izquierda
			  int aux;
			 
			  while(i < j){                          // mientras no se crucen las búsquedas                                   
			     while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
			     while(A[j] > pivote) j--;           // busca elemento menor que pivote
			     if (i < j) {                        // si no se han cruzado                      
			         aux= A[i];                      // los intercambia
			         A[i]=A[j];
			         A[j]=aux;
			     }
			   }
			   
			   A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
			   A[i]=pivote;      // los menores a su izquierda y los mayores a su derecha
			   
			   if(izq < j-1)
			      quicksort(A,izq,j-1);          // ordenamos subarray izquierdo
			   if(j+1 < der)
			      quicksort(A,j+1,der);          // ordenamos subarray derecho
		}
			

}
