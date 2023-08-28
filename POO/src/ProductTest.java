import java.util.Locale;
import java.util.Scanner;

public class ProductTest {
    public static void main (String args[]){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = entrada.nextLine();
        System.out.println("Price: ");
        product.price = entrada.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = entrada.nextInt();

        System.out.println(product);

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = entrada.nextInt();
        product.AddProducts(quantity);

        System.out.println("Update data: " + product);

        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = entrada.nextInt();
        product.RemoveProducts(quantity);
        System.out.println("Update data: " + product);
        

        entrada.close();



    }
}
