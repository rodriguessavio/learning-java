import java.util.Arrays;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int vetor[] = new int[10], maiorValor = -999; 

        for(int i = 0 ; i <= 9 ; i++){ 
            System.out.println("Informe um valor: ");
            vetor[i] = entrada.nextInt();
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
            }
        }

        System.out.print("Elementos do vetor ==> "+ Arrays.toString(vetor));
        System.out.println("\nMaior valor digitado ==> "+ maiorValor);
        entrada.close();
    }
}
