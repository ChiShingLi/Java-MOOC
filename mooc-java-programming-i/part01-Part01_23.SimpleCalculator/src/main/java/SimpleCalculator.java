
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int input1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int input2 = Integer.valueOf(scanner.nextLine());

        System.out.println(String.valueOf(input1) + " + " + String.valueOf(input2) + " = " + (input1 + input2));
        System.out.println(String.valueOf(input1) + " - " + String.valueOf(input2) + " = " + (input1 - input2));
        System.out.println(String.valueOf(input1) + " * " + String.valueOf(input2) + " = " + (input1 * input2));
        System.out.println(String.valueOf(input1) + " / " + String.valueOf(input2) + " = " + (double) input1 / input2);

    }
}
