package variables;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age; // here's the variable
        System.out.print("Enter your age: ");
        age = sc.nextInt(); // assign input to the variable

        System.out.println("You are " + age + " years old.");

        sc.close();
    }
}
