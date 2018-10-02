public class Rectangle extends Shape
{

    private double side1;
    private double side2;

    public Rectangle(double side1, double side2)
    {
        super("Rectangle");
        this.side1 = side1;
        this.side2 = side2;

    }
    @Override
    public double getArea()
    {
        return (side1*side2);
    }
    @Override
    public double getPerimeter()
    {
        return ( 2*(side1) + 2*(side2));
    }


}
