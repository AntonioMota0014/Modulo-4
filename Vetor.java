package PSII;
import java.util.Scanner;
public class Vetor {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        
        // declara�ao do vetor
        int[] vetor = new int[10];
        
        // declaracao de variavel
        int num;
        
        // entrada de dados -> vetor
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um valor para a posi��o " + i);
            vetor[i] = in.nextInt();
        }
        
        // entrada de dados -> vari�vel
        System.out.println("Digite um valor para procurar no vetor: ");
        num = in.nextInt();
        
        // leitura do vetor
        for(int i = 0; i < vetor.length; i++){
            
            // se existir no vetor o n�mero digitado
            if(vetor[i] == num){
                System.out.println("O �ndice do n�mero digitado �:  " + i);
            // se n�o existir...
            } else if(i == vetor.length-1){
                System.out.println("N�mero n�o encontrado no vetor.");
            }
        }
    }
}

