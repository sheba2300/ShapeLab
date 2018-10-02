public class ITriangle extends Shape
{
    private int base;
    private int height;
    public ITriangle(int base, int height)
    {
        super("ITriangle");
        this.base = base;
        this.height = height;
    }
    public double getArea()
    {
        return base * height/2
    }
}
