package arrays;


public class ArrayChallenge {
    public static void main(String[] args) {
        String[] orderIds = {"B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179","C234","D678","C564"};

        for (String item : orderIds) {
            if (item.startsWith("C")) {
                System.out.println(item);
            }
        }
    }
}

