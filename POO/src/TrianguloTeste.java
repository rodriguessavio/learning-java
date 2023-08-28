import java.util.Locale;
import java.util.Scanner;

public class TrianguloTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Triangulo a, b;
        a = new Triangulo();
        b = new Triangulo();

        System.out.println("Informe os valores do triangulo A: ");
        a.ladoA = entrada.nextDouble();
        a.ladoB = entrada.nextDouble();
        a.ladoC = entrada.nextDouble();

        System.out.println("Informe os valores do triangulo B: ");
        b.ladoA = entrada.nextDouble();
        b.ladoB = entrada.nextDouble();
        b.ladoC = entrada.nextDouble();

        entrada.close();

        System.out.printf("área = %.2f", a.calcularArea());
        System.out.printf("área = %.2f", b.calcularArea());
    }
}
