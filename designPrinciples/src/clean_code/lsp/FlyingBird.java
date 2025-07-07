package clean_code.lsp;

interface FlyingBird {
    void fly();
}

class Sparrow implements FlyingBird {
    public void fly() {
        System.out.println("Sparrow flying");
    }
}

class Ostrich {
    public void walk() {
        System.out.println("Ostrich walking");
    }
}
