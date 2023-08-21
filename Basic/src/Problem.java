import java.util.Locale;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {

        int min;
        double dif, total;
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe os minutos: ");
        min = entrada.nextInt();
        entrada.close();
        if (min > 100) {
            dif = min - 100;
            total = 50 + (dif * 2);

            System.out.printf("Você deve pagar %.2f já que excedeu os minutos padrões em %.2f minutos", total, dif);
        } else {
            total = 50;
            System.out.printf("Irá pagar o valor padrão de %.2f reais", total);
        }



    }
}
