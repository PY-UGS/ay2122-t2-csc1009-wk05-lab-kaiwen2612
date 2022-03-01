package Shape;

public abstract class Shape {
    protected int dim1;
    protected int dim2;
    protected double PI;

    public Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.PI = Math.PI;
    }

    public abstract double area();
}
