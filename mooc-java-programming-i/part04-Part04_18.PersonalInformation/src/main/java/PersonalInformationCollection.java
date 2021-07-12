
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    /*
    After the user has entered the last set of details (they enter an empty first name), exit the repeat statement.

Then print the collected personal information so that each entered object is printed in the
    following format: first and last names separated by a space (you don't print the identification number).
    An example of the working program is given below:
     */
    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String first = scanner.nextLine();
            if (first.isEmpty()) {
                break;
            }
            String last = scanner.nextLine();
            String id = scanner.nextLine();
            infoCollection.add(new PersonalInformation(first, last, id));
        }

        //print out each item's first and last name
        for (PersonalInformation item : infoCollection) {
            System.out.println(item.getFirstName() + " " + item.getLastName());
        }
    }
}
