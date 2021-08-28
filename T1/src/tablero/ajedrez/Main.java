package tablero.ajedrez;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LineaPosicion L0=new LineaPosicion("▧");
		LineaPosicion L1=new LineaPosicion("A");
		LineaPosicion L2=new LineaPosicion("B");
		LineaPosicion L3=new LineaPosicion("C");
		LineaPosicion L4=new LineaPosicion("D");
		LineaPosicion L5=new LineaPosicion("E");
		LineaPosicion L6=new LineaPosicion("F");
		LineaPosicion L7=new LineaPosicion("G");
		LineaPosicion L8=new LineaPosicion("H");
		LineaPosicion L9=new LineaPosicion("1");
		LineaPosicion L10=new LineaPosicion("2");
		LineaPosicion L11=new LineaPosicion("3");
		LineaPosicion L12=new LineaPosicion("4");
		LineaPosicion L13=new LineaPosicion("5");
		LineaPosicion L14=new LineaPosicion("6");
		LineaPosicion L15=new LineaPosicion("7");
		LineaPosicion L16=new LineaPosicion("8");
		
		
		Peon P1=new Peon("N","♟");
		Peon P2=new Peon("N","♟");
		Peon P3=new Peon("N","♟");
		Peon P4=new Peon("N","♟");
		Peon P5=new Peon("N","♟");
		Peon P6=new Peon("N","♟");
		Peon P7=new Peon("N","♟");
		Peon P8=new Peon("N","♟");
		PeonBl PB1=new PeonBl("B","♙");
		PeonBl PB2=new PeonBl("B","♙");
		PeonBl PB3=new PeonBl("B","♙");
		PeonBl PB4=new PeonBl("B","♙");
		PeonBl PB5=new PeonBl("B","♙");
		PeonBl PB6=new PeonBl("B","♙");
		PeonBl PB7=new PeonBl("B","♙");
		PeonBl PB8=new PeonBl("B","♙");
		
		Caballero C1 =new Caballero("N","♞");
		Caballero C2 =new Caballero("N","♞");
		CaballeroB CB1 =new CaballeroB("B","♘");
		CaballeroB CB2 =new CaballeroB("B","♘");
		
		Reina Ra =new Reina("N","♛");
		ReinaB RaB =new ReinaB("B","♕");
		Rey Ry =new Rey("N","♚");
		ReyB RyB =new ReyB("B","♔");
		
		
		Torre T1 =new Torre("N","♜");
		Torre T2 =new Torre("N","♜");
		TorreB TB1 =new TorreB("B","♖");
		TorreB TB2 =new TorreB("B","♖");
		
		Alfin A1 =new Alfin("N","♝");
		Alfin A2 =new Alfin("N","♝");
		AlfinB AB1 =new AlfinB("B","♗");
		AlfinB AB2 =new AlfinB("B","♗");
		
		Piezas [][] tablero=new Piezas[9][9];
		
		tablero[0][0]=L0;
		tablero[0][1]=L1;
		tablero[0][2]=L2;
		tablero[0][3]=L3;
		tablero[0][4]=L4;
		tablero[0][5]=L5;
		tablero[0][6]=L6;
		tablero[0][7]=L7;
		tablero[0][8]=L8;
		
		tablero[1][0]=L9;
		tablero[2][0]=L10;
		tablero[3][0]=L11;
		tablero[4][0]=L12;
		tablero[5][0]=L13;
		tablero[6][0]=L14;
		tablero[7][0]=L15;
		tablero[8][0]=L16;
		
		
		tablero[2][1]=P1;
		tablero[2][2]=P2;
		tablero[2][3]=P3;
		tablero[2][4]=P4;
		tablero[2][5]=P5;
		tablero[2][6]=P6;
		tablero[2][7]=P7;
		tablero[2][8]=P8;
		
		tablero[7][1]=PB1;
		tablero[7][2]=PB2;
		tablero[7][3]=PB3;
		tablero[7][4]=PB4;
		tablero[7][5]=PB5;
		tablero[7][6]=PB6;
		tablero[7][7]=PB7;
		tablero[7][8]=PB8;
		
		tablero[1][2]=C1;
		tablero[1][7]=C2;
		tablero[8][2]=CB1;
		tablero[8][7]=CB2;
		
		tablero[1][5]=Ra;
		tablero[8][5]=RaB;
		tablero[1][4]=Ry;
		tablero[8][4]=RyB;
		
		tablero[1][1]=T1;
		tablero[1][8]=T2;
		tablero[8][1]=TB1;
		tablero[8][8]=TB2;
		
		tablero[1][3]=A1;
		tablero[1][6]=A2;
		tablero[8][3]=AB1;
		tablero[8][6]=AB2;
		
		System.out.println();
		System.out.println("\t\t\t Tablero de Ajedrez");
		System.out.println("\t -------------------------------------------------------------------");
		for(int i=0;i<tablero.length;i++) {
			for(int j = 0; j < tablero[i].length; j++){ 
			
				System.out.print("\t"+tablero[i][j] + "");
				
			}
		
			System.out.println();
			System.out.println();	
		}
		System.out.println("\t -------------------------------------------------------------------");
	}

}
