package conditionals;

import java.util.Scanner;
public class DecisionMaker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your age: ");

            int age = scanner.nextInt();

            if (age < 13) {
                System.out.println("You are a child");
            } else if (age >= 13 && age <= 18) {
                System.out.println("You are a teen");
            } else if (age > 18) {
                System.out.println("You are an adult");
            }
        }
    }
}