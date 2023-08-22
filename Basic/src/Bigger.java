import java.util.Scanner;

public class Bigger {
    public static void main(String[] args){

        int maiorValor = -999;

        Scanner entrada = new Scanner(System.in);



        for (int i = 0 ; i <= 2 ; i++){
            System.out.println("informe um valor: ");
            int value = entrada.nextInt();
            maiorValor = (value > maiorValor) ? value : maiorValor;
        }

        System.out.println("Maior valor => "+maiorValor);
        entrada.close();
    }
}
