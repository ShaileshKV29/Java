import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        int arr[] = new int[12];
        for(int i = 0; i < 10; i++)
            arr[i] = i+1;
        int key;
        Scanner sc = new Scanner(System.in);
        key = sc.nextInt();
        int i = 0;
        while(arr[i] != key)
            i++;
        for(;i < arr.length - 1; i++)
            arr[i] = arr[i+1];
        for(int x: arr)
            System.out.print(x + " ");
    }
}
