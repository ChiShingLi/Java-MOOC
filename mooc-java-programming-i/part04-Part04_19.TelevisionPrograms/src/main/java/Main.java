
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /*
    Implement a program that begins by reading television programs from the user. 
    When the user inputs an empty string as the name of the program, the program stops reading programs.

After this the user is queried for a maximum duration. 
    Once the maximum is given, 
    the program proceeds to list all the programs whose duration 
    is smaller or equal to the specified maximum duration.
     */
    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Name: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine()); //convert to int
            programs.add(new TelevisionProgram(title, duration)); //add to list
        }

        System.out.print("Program's maximum duration?");
        int max = Integer.valueOf(scanner.nextLine());

        //find all tv titles within the max length;
        for (TelevisionProgram title : programs) {
            if (title.getDuration() <= max) {
                System.out.println(title);
            }
        }
    }
}
