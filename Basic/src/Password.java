import java.util.Scanner;

public class Password {
    public static void main (String[] args){
        int senha = 2002, senI = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a senha: ");
        senI = entrada.nextInt();

        while (senI != senha){
            System.out.println("------------------------------------------------");
            System.out.println("SENHA INCORRETA, INSIRA A SENHA CORRETA!");
            System.out.println("Informe a senha: ");
            senI = entrada.nextInt();
        }

        System.out.println("ACESSO PERMITIDO!");
        entrada.close();
    }
}
