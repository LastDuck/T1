package t01_ProgramacionOO; 
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner lector = new Scanner(System.in);
System.out.println("----Ingrese el valor del primer número-----");
int A = lector.nextInt();
System.out.println("----Ingrese el valor del segundo número-----");
int B = lector.nextInt();
 if (B==0) {
	 System.out.println("***la Division es imposible***");
 } else { 
	 
	 int C = A/B;
	 System.out.println("***la Division es:"+C+"***");
 }
	}

}
