
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        //find & print smallest
        int smallest = Integer.MAX_VALUE;
        for (int num : list) {
            smallest = Math.min(smallest, num);
        }
        System.out.println("Smallest number: " + smallest);
        
        //take care of multiple smallest # & print its index(s)
        int smallestIndex = list.indexOf(smallest);
        int lastSmallestIndex = list.lastIndexOf(smallest);
        //we know that all the multiple #'s are within the first and last indexes
        for (int i = smallestIndex; i <= lastSmallestIndex; i++) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }

    }
}
