public class MethodPractice {

    static int max(int x, int y)
    {
        if(x > y)
            return x;
        else
            return y;
    }

    public static void main(String[] args) {
        System.out.println(max(10,15));
    }
}