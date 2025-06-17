package arrays;

import java.util.Random;

public class OrderIDGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        String[] orderIDs = new String[5];

        for (int i = 0; i < orderIDs.length; i++) {
            // Generate a random uppercase letter between A (65) and E (69)
            //picks a nunmber between 0 and 4. the '+A' then converts it to a letter
            char prefix = (char)(random.nextInt(5) + 'A');

            // Generate a random number from 1 to 999 and format it with leading zeros
            //this picks to 998 but the plus one makes it 999
            int number = random.nextInt(999) + 1;
            //converts the number to a 3 digit string
            String suffix = String.format("%03d", number);

            // Combine prefix and suffix to form the OrderID
            orderIDs[i] = prefix + suffix;
        }

        // Print all generated OrderIDs
        for (String orderID : orderIDs) {
            System.out.println(orderID);
        }
    }
}