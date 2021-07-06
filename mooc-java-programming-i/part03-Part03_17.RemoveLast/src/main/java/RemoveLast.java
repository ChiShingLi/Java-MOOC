
import java.util.ArrayList;

/*
Create the method public static void removeLast(ArrayList<String> strings) in the exercise template. 
The method should remove the last value in the list it receives as a parameter. 
If the list is empty, the method does nothing.
 */
public class RemoveLast {

    public static void removeLast(ArrayList<String> strings) {
        if (strings.isEmpty()) {
            return;
        }
        strings.remove(strings.size() - 1);
    }

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

}
