interface Test
{
    void method1();
    void method2();
}

class Imp implements Test
{
    public void method1()
    {
        System.out.println("Method 1 of Imp");
    }

    public void method2()
    {
        System.out.println("Method 2 of Imp");
    }
}

public class Interface {
    public static void main(String[] args)
    {
        Imp imp = new Imp();
        imp.method1();
        imp.method2();
    }
}
