public class ITriangle extends Shape
{
    private int base;
    private int height;
    private int side;
    public ITriangle(int base, int height, int side)
    {
        super("ITriangle");
        this.base = base;
        this.height = height;
        this.side = side;
    }
    public double getArea()
    {
        return (base * height)/2;
    }
    public double getPerimeter()
    {
        return side * 2 + base;
    }
}
