package Shape;

public class Triangle extends Shape{

    public Triangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return 0.5  * dim1 * dim2;
    }
}
