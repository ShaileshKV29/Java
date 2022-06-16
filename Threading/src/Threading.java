class MyThread extends Thread
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

public class Threading {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        int i = 1;
        while(i < 1000)
        {
            System.out.println(i + " World");
            i++;
        }
    }
}
