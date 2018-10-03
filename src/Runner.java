public class Runner {
    public static void main(String[] args)
    {
        Shape shape1 = new Rectangle(10,5);
        Shape shape2 = new ETriangle(5);
        Shape shape3 = new Circle(10);
        Shape shape4 = new Square(10);
        Shape shape5 = new ITriangle(10,10,5);

        System.out.println(shape1);
        System.out.println("The perimeter is: " +shape1.getPerimeter());
        System.out.println("My area is: " + shape1.getArea());

        Shape[] shapes = {shape1, shape2, shape3,shape4,shape5};

        for (Shape cur : shapes)
        {
            System.out.println(cur);
            System.out.println("The perimeter is: " +cur.getPerimeter());
            System.out.println("My area is: " + cur.getArea());
        }


    }
}
