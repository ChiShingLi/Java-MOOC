
import java.util.Scanner;

public class NameOfTheOldest {

    /*
    Write a program that reads names and ages from the user until an empty line is entered. 
    The name and age are separed by a comma.

    After reading all user input, the program prints the name of the oldest person.
    You can assume that the user enters at least one person, 
    and the that one of the users is older than the others.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldestName = "";
        int oldestAge = Integer.MIN_VALUE;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            //split by comma
            String[] splitted = input.split(",");
            //check the oldest age then assign the name to oldestName
            if (Integer.valueOf(splitted[1]) > oldestAge) {
                oldestAge = Integer.valueOf(splitted[1]);
                oldestName = splitted[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
