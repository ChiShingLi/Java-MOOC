
import java.util.Scanner;

public class AVClub {

    /*Write a program that reads user input until an empty line.
    For each non-empty string, the program splits the string by spaces and 
    then prints the pieces that contain av, each on a new line.
    
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            //check every word to see if it contains the letters 'av' 
            String[] splitted = input.split(" ");
            for (String word : splitted) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
