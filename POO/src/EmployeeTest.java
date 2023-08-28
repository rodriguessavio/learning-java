import java.util.Locale;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.printf("Name: ");
        employee.name = entrada.nextLine();
        System.out.println("");
        System.out.printf("Gross salary: ");
        employee.grossSalary = entrada.nextDouble();
        System.out.println("");
        System.out.printf("Tax: ");
        employee.tax = entrada.nextDouble();
        System.out.println("");

        System.out.println(employee);

        System.out.printf("Wich percentage to increase salary? ");
        double percentage = entrada.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("");

        System.out.println("Update data: "+ employee);
        entrada.close();
        
    }
}
