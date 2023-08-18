import java.util.Locale;

public class ExecOne {
    public static void main(String[] args){
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price = 2100.00;
        double price2 = 650.50;
        double price3 = 53.234567;

        System.out.printf("Products: %n %s, whice price is $%.2f%n %s, wich price is $%.2f%n", product1, price, product2, price2);
        System.out.printf("\n");
        System.out.printf("Record: %d years old, code %d and gender: %s", age, code, gender);
        System.out.printf("\n");
        System.out.printf("Measue with eight decimal place: %f%n Rouded (Three decimal places): %.3f%n", price3, price3);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", price3);
    }
}
