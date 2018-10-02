public class Circle extends Shape{
    private int radius;

    public Circle (int radius)
    {
        super("Circle");
        this.radius = radius;
    }
    public double getArea()
    {
        return (Math.PI * Math.sqrt(radius));
    }

    public double getPerimeter()
    {
        return ((radius*2) *Math.PI);
    }
}
