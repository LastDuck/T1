package deberes;
import java.util.Scanner;
public class DeberImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.util.Scanner;);
		
		System.out.println("----Ingrese un numero: -----");
		int n = lector.nextInt();
		
		int i=1;
		int a=1;
		while(i<=n) {
			
			a= a+2;
			if((a==7)||(a==17)||(a==27)) {
				System.out.println("Numero: "+"*"+ a);
				
			}else {
				System.out.println("Numero: "+a);
				
			}
			i = i+1;
		}
			
		
	}

	
}
