package Week9PracticeProblems;

import java.util.*;

abstract class Plot {
    String owner;

    Plot(String owner) {
        this.owner = owner;
    }

    abstract double getArea();
    abstract String getShape();
}

class Circle extends Plot {
    double radius;

    Circle(String owner, double radius) {
        super(owner);
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    String getShape() {
        return "CIRCLE";
    }
}

class Rectangle extends Plot {
    double length, width;

    Rectangle(String owner, double length, double width) {
        super(owner);
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }

    String getShape() {
        return "RECTANGLE";
    }
}

class Triangle extends Plot {
    double base, height;

    Triangle(String owner, double base, double height) {
        super(owner);
        this.base = base;
        this.height = height;
    }

    double getArea() {
        return 0.5 * base * height;
    }

    String getShape() {
        return "TRIANGLE";
    }
}

public class Week9P1GardenPlot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String shape = sc.next();

            if (shape.equals("CIRCLE")) {
                String owner = sc.next();
                double radius = sc.nextDouble();

                Plot p = new Circle(owner, radius);
                double area = p.getArea();

                System.out.printf("%s (%s): %.2f%n",
                        owner, p.getShape(), area);

                total += area;

            } else if (shape.equals("RECTANGLE")) {
                String owner = sc.next();
                double length = sc.nextDouble();
                double width = sc.nextDouble();

                Plot p = new Rectangle(owner, length, width);
                double area = p.getArea();

                System.out.printf("%s (%s): %.2f%n",
                        owner, p.getShape(), area);

                total += area;

            } else if (shape.equals("TRIANGLE")) {
                String owner = sc.next();
                double base = sc.nextDouble();
                double height = sc.nextDouble();

                Plot p = new Triangle(owner, base, height);
                double area = p.getArea();

                System.out.printf("%s (%s): %.2f%n",
                        owner, p.getShape(), area);

                total += area;
            }
        }

        System.out.printf("Total Area: %.2f%n", total);
    }
}