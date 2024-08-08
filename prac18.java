class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}


public class prac18{
    public static void main(String[] args) {

        Rectangle x = new Rectangle(10, 10);
        Square s = new Square(10);

        System.out.println(x.area());
        System.out.println(x.perimeter());
        System.out.println(s.area());
        System.out.println(s.perimeter());
        

        
    }
}
