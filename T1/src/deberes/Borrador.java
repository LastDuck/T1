package deberes;
import java.util.Scanner;
public class Borrador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int np,suma=0;

		do {
			System.out.println("Introduce un numero");
			np=entrada.nextInt();
			suma=suma+np;

		}
		while(np!=0);
		System.out.println("La suma de todos los numeros es:"+suma);
	}

}
