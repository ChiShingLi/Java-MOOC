
import java.util.Scanner;

public class PrintThrice {

    /*
    Write a program, that reads a string from the user and then prints it three times.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        String input = scanner.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.print(input);
        }

    }
}
