package t01_ProgramacionOO;
import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VALIO EL COMENTARIO ROY 
		Scanner lector = new Scanner(System.in);
		System.out.println("----Ingrese un numero-----");
		int A = lector.nextInt();
		int F=1;
		for(int ast=1; ast<=A;ast++ ) {
			for(F=1;ast<=F;F++) {
				System.out.print("*");
				
			}
			System.out.println();	
		}
		
	}
}

	
	
