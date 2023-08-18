import java.util.Scanner;

public class DataInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        double wage;
        System.out.println("type your name:");
        name = input.next();
        System.out.println("type your age:");
        age = input.nextInt();
        System.out.println("What is your wage?");
        wage = input.nextDouble();

        System.out.printf("The name entered was %s, you have %d years old and have a wage of %.2f", name, age, wage);


    }
}
