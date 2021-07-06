
import java.util.Scanner;

public class LastWords {

    /*
    Write a program that reads user input until an empty line is entered. 
    For each non-empty line the program splits the string by spaces and prints the last part of the string.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            //get the last part of the string
            String[] splitted = input.split(" ");
            System.out.println(splitted[splitted.length - 1]);
        }

    }
}
