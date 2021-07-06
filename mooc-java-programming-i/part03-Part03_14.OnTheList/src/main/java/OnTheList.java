
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        // after reading the inputs one more string is requested from the user. 
        // The program then tell whether that string was found in the list or not.
        System.out.println("Search for ?");
        String input = scanner.nextLine();
        if (list.indexOf(input) == -1) {
            System.out.println(input + " was not found!");
        } else {
            System.out.println(input + " was found!");
        }
    }
}
