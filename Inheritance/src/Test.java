class Circle
{
    public int radius;
    public Circle()
    {
        radius = 0;
    }
    public double area()
    {
        return radius*radius*3.14;
    }

    public double perimeter()
    {
        return 2*3.13*radius;
    }
}

class Cylinder extends Circle
{
    public int height;
    public Cylinder()
    {
        height = 0;
    }

    public double volume()
    {
        return 3.14*radius*radius*height;
    }
}

public class Test {
    public static void main(String[] args) {

    }
}
