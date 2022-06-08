public class VariableArguments {

    static int max(int x, int y)
    {
        return x > y ? x : y;
    }

    static int max(int...x)
    {
        int max = 0;
        for(int a: x)
        {
            if(a > max)
                max = a;
        }
        System.out.println(x.getClass().getSimpleName());
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max(10,5));
        System.out.println(max(10,5,20,30,11,1,12,33));
        System.out.println(max(new int[]{1,2,3,4,5,6,7}));
        int x[] = {1,2,3,4,5};
        System.out.println(x.getClass().getSimpleName());
    }
}
