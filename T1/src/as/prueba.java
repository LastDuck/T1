package as;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //54565
		
		   Scanner teclado= new Scanner(System.in);
		   
	        System.out.print("\t\" Ingrese la dimension del arreglo: ");
	        int N=teclado.nextInt();
	        int arreglo[]= new int[N];
	     
	        //Ingresando valores al arreglo
	        for(int i=0; i<arreglo.length; i++){
	            System.out.print("A["+i+"]= ");
	            arreglo[i]=teclado.nextInt();
	        }

	        quicksort(arreglo,0,N-1);
	     
	        //Imprimiendo el arreglo ordenado
	        System.out.println("===== Metodo de Ordenamineto Quick Sort ====");
	        for(int i =0; i<arreglo.length;i++){
	         System.out.print("\t"+arreglo[i]);
	     }
	 
	    }
	 
	    //Metodo de ordenamineto Quick Sort
	
	static void quicksort(int arreglo[],int primero,int ultimo){
	 int central,i,j;
	 int pivote;

	 central=(primero+ultimo)/2;

	 pivote=arreglo[central];

	 i=primero;

	j=ultimo;
	    
	do{
	   while(arreglo[i]<pivote) 
		   i++;
	   while(arreglo[j]>pivote)
		   j--;
	   		if(i<=j){
	   			int cont;
	   			cont=arreglo[i];
	   			arreglo[i]=arreglo[j]; /*cambio  A[i] con A[j] */
	   			arreglo[j]=cont;
	    i++;
	    j--;
	   }
	  }
	 
	 while(i<=j);
	if(i<ultimo)
 		quicksort(arreglo,i,ultimo); /*lista derecha*/ 	
	if(primero<j)
	 	quicksort(arreglo,primero,j); /* lista izquierda*/
	 
	}
	 
	 
}