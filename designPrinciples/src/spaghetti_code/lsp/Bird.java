package spaghetti_code.lsp;

public class Bird {
    public void fly() {
        System.out.println("Bird flying");
    }

    public static void main(String[] args) {
        Bird b1 = new Sparrow();
        b1.fly(); // okay

        Bird b2 = new Ostrich(); // uh-oh
        b2.fly(); // ostrich can't fly but method is called anyway
    }
}

class Sparrow extends Bird {
    public void fly() {
        System.out.println("Sparrow flying");
    }
}

class Ostrich extends Bird {
    public void fly() {
        // Ostrich can't fly, but is forced to implement fly
        System.out.println("Oops... Ostrich trying to fly... Crash!");
    }
}
