package spaghetti_code.osp;

public class Shapes {
    public static void main(String[] args) {
        printArea("rectangle", 5, 10);
        printArea("circle", 7, 0); // 0 is unused for circle
    }

    public static void printArea(String shapeType, double a, double b) {
        if (shapeType.equals("rectangle")) {
            double area = a * b;
            System.out.println("Area: " + area);
        } else if (shapeType.equals("circle")) {
            double area = Math.PI * a * a;
            System.out.println("Area: " + area);
        } else {
            System.out.println("Unknown shape");
        }
    }
}

