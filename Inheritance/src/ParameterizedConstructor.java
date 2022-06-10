class Parent2
{
    public Parent2()
    {
        System.out.println("Parent Constructor");
    }

    public Parent2(int x)
    {
        System.out.println("Parameterized Constructor of Parent");
    }
}

class Child2 extends Parent2
{
    public Child2()
    {
        System.out.println("Child Constructor");
    }

    public Child2(int y)
    {
        System.out.println("Parameterized Constructor of Child");
    }

    public Child2(int x, int y)
    {
        super(x);
        System.out.println("2 Param of Child");
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Child2 c = new Child2(20,10);
    }
}
