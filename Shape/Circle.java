package Shape;

public class Circle extends Shape{

    public Circle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return this.dim1 * this.dim2 * this.PI;
    }
}
