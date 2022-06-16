class My implements Runnable
{
    public void run()
    {
        int i = 1;
        while(i < 1000)
        {
            System.out.println(i + " Hello");
            i++;
        }
    }
}

public class UsingRunnable {
    public static void main(String[] args) {
        My m = new My();
        Thread t = new Thread(m);
        t.start();
        int i = 1;
        while(i < 1000)
        {
            System.out.println(i + " World");
            i++;
        }
    }
}
