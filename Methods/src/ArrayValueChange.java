public class ArrayValueChange {
    static void update(int A[])
    {
        A[0] = 20;
    }

    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6};
        update(A);
        System.out.println(A[0]);
    }
}
