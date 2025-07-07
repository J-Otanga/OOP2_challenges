package spaghetti_code.dip;

class MechanicalKeyboard {
    public void type() {
        System.out.println("Typing with mechanical keyboard...");
    }
}

class Computer {
    public MechanicalKeyboard keyboard;

    public void doSomething() {
        keyboard.type();
    }
    public class Main {
    public static void main(String[] args) {
        MechanicalKeyboard keyboard = new MechanicalKeyboard();
        Computer computer = new Computer();
        computer.keyboard = keyboard;
        computer.doSomething();
    }
}
}
