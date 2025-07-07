package spaghetti_code.isp;

public class Human {
    public void work() {
        System.out.println("Human working");
    }

    public void eat() {
        System.out.println("Human eating");
    }

    public static void main(String[] args) {
        Human h = new Human();
        h.work();
        h.eat();

        Robot r = new Robot();
        r.work();
        r.eat(); // robots don't eat, but we added it anyway 🤷
    }
}

class Robot {
    public void work() {
        System.out.println("Robot working");
    }

    public void eat() {
        System.out.println("Robot doesn't eat but here's the method anyway!");
    }
}
