class Super
{
    void method1(){
        System.out.println("Method 1 of Super");
    }

    void method2()
    {
        System.out.println("Method 2 of Super");
    }
}

class Sub extends Super
{
    @Override
    void method2()
    {
        System.out.println("Method 2 of Sub");
    }

    void method3()
    {
        System.out.println("Method 3 of Sub");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Super su = new Sub();
        su.method1();
        su.method2();
//      su.method3();
    }
}
