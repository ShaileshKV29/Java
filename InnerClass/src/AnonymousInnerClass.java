abstract class My
{
    abstract void display();
}

class New
{
    void display()
    {
        My m = new My(){
            void display()
            {
                System.out.println("Anonymous Class");
            }
        };
        m.display();
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        New n = new New();
        n.display();
    }
}
