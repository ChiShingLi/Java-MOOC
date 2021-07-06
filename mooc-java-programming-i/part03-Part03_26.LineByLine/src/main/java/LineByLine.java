
import java.util.Scanner;

public class LineByLine {

    /*
    Write a program that reads strings from the user. 
    If the input is empty, the program stops reading input and halts.
    For each non-empty input it splits the string input by whitespaces 
    and prints each part of the string on a new line.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            //split by white space
            String[] splitted = input.split(" ");
            for (String word : splitted) {
                System.out.println(word);
            }
        }
    }
}
