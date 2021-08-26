package ejercicio.matrices;

public class MainMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 2. Desarrolar un programa que imprima la siguiente imagen
		 
		int A[][] = new int[4][4];
		for (int fila = 0; fila < 4;fila++) {

			for (int columna = 0; columna < 4; columna++) {
				if(fila==columna) {
					A[fila][columna]=1;
					
				}

			}

		}

		System.out.println("Iniciamos a imprimir la Matriz");
		for (int fila = 0; fila < 5; fila++) {

			for (int columna = 0; columna< 4; columna++) {
				System.out.print( A[fila][columna] + " ");

			}
			System.out.println();

		}
	}
}
