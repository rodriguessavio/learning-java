import java.util.Locale;

public class TrianguloTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Triangulo a = new Triangulo(3, 4, 5);
        Triangulo b = new Triangulo(7.5, 4.5, 4.2);
        System.out.println(a.calcularArea());
        System.out.printf("área = %.2f", b.calcularArea());
    }
}
