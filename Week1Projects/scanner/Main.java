package scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        if (!name.isEmpty()) {
            System.out.println("Hello " + name + "!");
        } else {
            System.out.println("You didn't type anything.");
        }

        sc.close();
    }
}
