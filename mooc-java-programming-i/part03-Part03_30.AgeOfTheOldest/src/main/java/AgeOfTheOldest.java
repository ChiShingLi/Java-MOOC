
import java.util.Scanner;

public class AgeOfTheOldest {

    /*
    Write a program that reads names and ages from the user until an empty line is entered. 
    The name and age are separated by a comma.

    After reading all user input, the program prints the age of the oldest person. 
    You can assume that the user enters at least one person, 
    and that one of the users is older than the others.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = Integer.MIN_VALUE;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            //get the oldest age
            String[] splitted = input.split(",");
            //get the second part of the splitted string and convert it into int
            oldestAge = Math.max(oldestAge, Integer.valueOf(splitted[1]));
        }
        System.out.println("Age of the oldest: " + oldestAge);

    }
}
