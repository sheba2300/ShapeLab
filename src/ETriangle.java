public class ETriangle extends Shape
    {
        private int side;
        public ETriangle(int side)
        {
            super("ETriangle");
            this.side = side;
        }
        public double getArea()
        {
            return (side * side * .433);
        }
        public double getPerimeter()
        {
            return (side * 3);
        }
    }
