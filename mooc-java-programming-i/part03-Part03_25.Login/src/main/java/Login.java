
import java.util.Scanner;
import java.util.HashMap;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> login = new HashMap<>();
        login.put("alex", "sunshine");
        login.put("emma", "haskell");

        System.out.println("Enter username: ");
        String name = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        //check username
        if (login.containsKey(name)) {
            //check password
            if (login.get(name).equals(password)) {
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
            //wrong username
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
