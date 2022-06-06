import java.util.Scanner;

public class ArrayInsert {
    public static void main(String[] args) {
        int arr[] = new int[12];
        for(int i = 0; i < 10; i++)
            arr[i] = i+1;
        int key;
        int item;
        Scanner sc = new Scanner(System.in);
        key = sc.nextInt();
        item = sc.nextInt();
        int n = arr.length - 2;
        while(n != key)
        {
            arr[n]  = arr[n-1];
            n--;
        }
        arr[n] = item;
        for(int x: arr)
            System.out.print(x + " ");
    }
}
