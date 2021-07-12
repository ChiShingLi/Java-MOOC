
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    /*
    Write a program that reads names of items from the user. 
    If the name is empty, the program stops reading. 
    Otherwise, the given name is used to create a new item,
    which you will then add to the items list.

Having read all the names, 
    print all the items by using the toString method of the Item class. 
    The implementation of the Item class keeps track of the time of creation,
    in addition to the name of the item.
     */
    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            items.add(new Item(input));
        }
        
        System.out.println(items.toString());
    }
}
