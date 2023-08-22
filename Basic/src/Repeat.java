import java.util.Scanner;

public class Repeat {
    public static void main (String[] args){
        int value = 0, aux;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        aux = entrada.nextInt();
        
        while (aux != 0){

            if (aux != 0) {
                value = aux + value;
                System.out.println("Digite um valor: ");
                aux = entrada.nextInt();
            }
        }

        entrada.close();
        System.out.println("Valor Final ==> "+value);
    }
}
