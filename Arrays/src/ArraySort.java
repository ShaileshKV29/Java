public class ArraySort {
    public static void main(String[] args) {
        String arr[] = {"java", "python", "Pascal", "smalltalk", "ada", "back"};
        java.util.Arrays.sort(arr);

        for(String x: arr)
            System.out.println(x);
    }
}
