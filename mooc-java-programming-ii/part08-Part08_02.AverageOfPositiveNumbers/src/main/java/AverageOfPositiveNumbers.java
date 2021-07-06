
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0;
        int sum = 0;

        while (true) {
            double input = Double.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input < 0) {
                continue;
            }
            sum += input;
            count++;
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(Math.abs(sum / count));
        }

    }
}
