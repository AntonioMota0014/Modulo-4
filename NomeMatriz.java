package pacote1;
import java.util.Scanner;
public class NomeMatriz {

	public static void main(String[] args) {
		int C,L;
		Scanner LerS = new Scanner (System.in);
		System.out.print("Qual o numero de linha");
		L=LerS.nextInt();
		System.out.print("Qual o numero de colunas");
		C=LerS.nextInt();
		String[] [] A=new String [L][C];
		for (int I=0; I<L; I++)
        for (int J=0; J<C; J++)
        {System.out.printf("Elemento da linha " + (I+1) + " da coluna " + (J+1));
        A [I][J]=LerS.next();}
        System.out.println();
        for(int I=0;I<L;I++)
        {for(int J=0;J<C;J++)
        	System.out.printf(A[I][J] + "  ");
        System.out.println();
        }
	
	}

	}

	

