public class Ellipse extends Shape{
        private int axisA;
        private int axisB;

        public Ellipse (int axisA, int axisB)
        {
            super("Ellipse");
            this.axisA = axisA;
            this.axisB = axisB;
        }
        public double getArea()
        {
            return ((2*Math.PI)*(Math.sqrt((Math.pow(axisA,2) + (Math.pow(axisB,2)))/2)));
        }

        public double getPerimeter()
        {
            return (Math.PI * axisA * axisB);

        }
    }


