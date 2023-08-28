import java.util.Locale;
import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);
        
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.height = entrada.nextDouble();
        rectangle.width = entrada.nextDouble();

        System.out.println(rectangle);

        entrada.close();

    }
}
