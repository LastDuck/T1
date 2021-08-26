package ejercicio.vectores;

public class MainVectores {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//1. Declarar un vecto miVector[10] tipo int
		int miVector []=new int[10];
		//2. Declarar un vector miVector[5] tipo char
		char miVectorr []=new char[5];
		//3. Declarar un vector miVec[4] tipo char y asignemos la letra "A"  a la posicion 
		//0 y 2
		char miVecr []=new char[4];
		miVecr[0]='A';
		miVecr[2]='B';
	//4. Declarar un vector miVec[4] tipo byte y asignemos 0 a la posicion 0,1,2 y 3. 
	
	byte miVec1 []=new byte[4];
	miVec1[0]=0;
	miVec1[1]=0;
	miVec1[2]=0;
	miVec1[3]=0;
	//4. Declarar un vector miVec[3] tipo char y asignemos la letra A a la posicion 0 y 1 y la poscion 2 la letra B
	char miVec2[]=new char[3];
	miVec2[0]='A';
	miVec2[1]='A';
	miVec2[2]='B';
	System.out.println("Impresion 1:"+miVec2[0]);
	System.out.println("Impresion 2:"+miVec2[2]);
}
}
