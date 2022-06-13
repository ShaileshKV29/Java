interface TestNew
{
    void m1();
    void m2();

    private void m3()
    {
        System.out.println("Private Method of Test");
    }
}

class Implement implements TestNew
{
    public void m1(){}
    public void m2(){}
    public void m4()
    {
        m3();
    }
}

public class PrivateMethods {
    public static void main(String[] args) {

    }
}
