
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /*
    Write a program that first reads book information from the user. 
    The details to be asked for each book include the title, the number of pages and the publication year. 
    Entering an empty string as the name of the book ends the reading process.

After this the user is asked for what is to be printed. 
    If the user inputs "everything", all the details are printed: the book titles, 
    the numbers of pages and the publication years. 
    However, if the user enters the string "name", only the book titles are printed.
     */
    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            library.add(new Book(title, pages, year));
        }
        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();

        if (input.equals("everything")) {
            //print all
            for (Book item : library) {
                System.out.println(item);
            }
        } else {
            //print only the book title
            for (Book item : library) {
                System.out.println(item.getTitle());
            }
        }
    }
}
