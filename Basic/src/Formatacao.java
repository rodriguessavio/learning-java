import java.util.Locale;

public class Formatacao {
    public static void main(String[] args) {
        String nome = "Roberto";
        int idade = 20;
        double salario = 2000.46;

        Locale.setDefault(Locale.US);
        System.out.printf("Me chamo %s tenho %d anos, e possuo um salário de: %.2f reais", nome, idade, salario);
        System.out.println("a");
    }
}