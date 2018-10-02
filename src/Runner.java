public class Runner {
    public void main(String[] args)
    {
        Shape shape1 = new Rectangle(10,5);
        Shape shape2 = new ETriangle(5);
        Shape shape3 = new Circle(10);

        System.out.println(shape1);
        System.out.println("The perimeter is: " +shape1.getPerimeter());
        System.out.println("My area is: " + shape1.getArea());

        Shape[] shapes = {shape1, shape2, shape3};

        for (Shape cur : shapes)
        {
            System.out.println(cur);
            System.out.println("The perimeter is: " +cur.getPerimeter());
            System.out.println("My area is: " + cur.getArea());
        }


    }
}
