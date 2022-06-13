class OuterNew
{
    void display()
    {
        class Inner
        {
            void display()
            {
                System.out.println("Local Inner Display");
            }
        }

        Inner i = new Inner();
        i.display();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        OuterNew o = new OuterNew();
        o.display();
    }
}
