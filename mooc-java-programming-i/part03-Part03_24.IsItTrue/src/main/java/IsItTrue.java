
import java.util.Scanner;

public class IsItTrue {

    /*
    Write a program that asks the user for a string. If the user writes the string "true", 
    the program prints "You got it right!", otherwise it prints "Try again!".
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equals("true")){
            System.out.println("You got it right!");
        } else{
            System.out.println("Try again!");
        }
    }
}
