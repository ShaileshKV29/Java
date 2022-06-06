public class ArraySizeIncrease {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int B[] = new int[2*A.length];
        System.out.println(A.length);
        for(int i = 0; i < A.length; i++)
            B[i] = A[i];
        A = B;
        B = null;
        System.out.println(A.length);
    }
}
