class Outer
{
    int x = 10;

    class Inner
    {
        int y = 20;

        void innerMethod()
        {
            System.out.println(x);
            System.out.println(y);
        }
    }

    void outerMethod()
    {
        Inner i = new Inner();
        i.innerMethod();
        System.out.println(i.y);
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerMethod();

        Outer.Inner i = new Outer().new Inner();
        i.innerMethod();
    }
}
