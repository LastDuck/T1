package t01_ProgramacionOO;
import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		System.out.println("----Ingrese un numero-----");
		int A = lector.nextInt();
		int F=1;
		for(int ast=A; ast<=A;ast-- ) {
			for(F=1;F<=ast;F++) {
				System.out.print("*");
				
			}
			System.out.println();	
			System.out.println("----Ingrese un numero-----");
			System.out.println("----Ingrese un numero-----");
		}
		
	}

}
