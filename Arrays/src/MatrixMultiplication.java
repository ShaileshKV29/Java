public class MatrixMultiplication {
    public static void main(String[] args) {
        int A[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int B[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int C[][] = new int[3][3];

        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[0].length; j++)
            {
                for(int k = 0; k < A.length; k++)
                {
                    C[i][j] += A[i][j] * B[k][j];
                }
            }
        }

        for(int x[]: C)
        {
            for(int y: x)
                System.out.print(y + " ");
            System.out.println();
        }
    }
}
