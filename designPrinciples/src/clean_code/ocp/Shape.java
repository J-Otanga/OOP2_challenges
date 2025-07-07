package clean_code.ocp;

interface Shape {
    double area();
}

class Rectangle implements Shape {
    private double width, height;

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double area() {
        return width * height;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {
    public void printArea(Shape shape) {
        System.out.println("Area: " + shape.area());
    }
}
