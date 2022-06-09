class Array
{
    private int size;
    private int length;
    private int A[];

    public Array()
    {
        this.size = 10;
        this.length = 0;
        A = new int[10];
    }

    public Array(int arr[], int length)
    {
        A = new int[arr.length];
        for(int i = 0; i < length; i++)
            A[i] = arr[i];
        this.size = arr.length;
        this.length = length;
    }

    public void display()
    {
        for(int x: A)
            System.out.print(x + " ");
        System.out.println();
    }
}

public class Constructors {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Array arr2 = new Array(arr, 5);
        arr2.display();

        Array arrays[] = new Array[10];
    }
}
