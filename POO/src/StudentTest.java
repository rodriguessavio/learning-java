import java.util.Locale;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Informe seu nome: ");
        student.nome = entrada.nextLine();
        System.out.println("Informe suas notas: ");
        student.n1 = entrada.nextDouble();
        student.n2 = entrada.nextDouble();
        student.n3 = entrada.nextDouble();

        System.out.println(student.aproved());
        entrada.close();
    }
}
