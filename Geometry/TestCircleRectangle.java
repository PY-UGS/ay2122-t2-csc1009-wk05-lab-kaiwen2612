package Geometry;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(1, "white", false);
        System.out.println(circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2, 4, "red", true);
        System.out.println(rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());

    }
    
}
