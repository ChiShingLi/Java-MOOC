
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            statistics.addNumber(input);
            //even
            if (input % 2 == 0) {
                even.addNumber(input);
            } else {
                //odd
                odd.addNumber(input);
            }

        }
        //print out the sum
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}
