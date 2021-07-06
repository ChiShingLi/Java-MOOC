
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (input != "end") {
            input = scanner.nextLine();
            if (input.contains("end")) {
                break;
            }
            System.out.println(Integer.valueOf(input) * Integer.valueOf(input) * Integer.valueOf(input));
        }
    }
}
