public class Triangle extends Shape
    {
        private int side;
        private int height;
        public Triangle(int side, int height)
        {
            super("Triangle");
            this.side = side;
            this.height = height;
        }
        public double getArea()
        {
            return .5*(side * height);
        }
        public double getPerimeter()
        {
            return side * 3;
        }
    }
