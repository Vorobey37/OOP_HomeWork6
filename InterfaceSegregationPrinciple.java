public class InterfaceSegregationPrinciple {
    //Переписать код в соответствии с Interface Segregation Principle
}

//было так:
interface Shape {
    double area();
    double volume();
}
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
        }

    @Override
    public double volume() {
        throw new UnsupportedOperationException();
        }
}
class Cube implements Shape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }
    
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}

//стало так:
interface Shape2D {
    double area();
}
interface Shape3D {
    double volume();
}
class Circle1 implements Shape2D {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
        }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
        }
}
class Cube1 implements Shape2D, Shape3D {
    private int edge;

    public Cube1(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }
    
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}