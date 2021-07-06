
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    /*
    Write a program that reads names and birth years from the user until an empty line is entered. 
    The name and birth year are separated by a comma.

After that the program prints the longest name and the average of the birth years. 
    If multiple names are equally longest, you can print any of them. 
    You can assume that the user enters at least one person.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        double yearSum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            //split the string by commma
            String[] splitted = input.split(",");

            //check the current string length vs the longestName that we've stored
            if (splitted[0].length() > longestName.length()) {
                longestName = splitted[0];
            }
            //increase total count and add yearSum
            count++;
            yearSum += Integer.valueOf(splitted[1]);
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + yearSum / count);
    }
}
