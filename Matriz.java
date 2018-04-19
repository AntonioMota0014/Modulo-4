package pacote1;
import java.util.Scanner;
public class Matriz {

	public static void main(String[] args) {
		int C,L;
		Scanner LerS = new Scanner (System.in);
		System.out.print("Qual o numero de linha");
		L=LerS.nextInt();
		System.out.print("Qual o numero de colunas");
		C=LerS.nextInt();
		int[] [] A=new int [L][C];
		for (int I=0; I<=L-1; I++)
        for (int J=0; J<=C-1; J++)
        {System.out.printf("Elemento A [%d,%d]?", I , J );
        A [I][J]=LerS.nextInt();}
        System.out.println();
        for(int I=0;I<=L-1;I++)
        {for(int J=0;J<=C-1;J++)
        	System.out.printf("%4d",A[I][J]);
        System.out.println();
        }
	
	}
        	
	}
