class ArithmeticJava {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 0;
        int answer = 0; // Declare answer outside try so it's accessible

        try {
            answer = number1 / number2;
            System.out.println("Answer: " + answer); // Must be inside try
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Program continues after handling the exception.");
        }
    }
}
