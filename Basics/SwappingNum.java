public class SwappingNum {
    public static void main(String[] args) {
        int a, b;
        a = 9;
        b = 12;
        System.out.println("Value of a before swapping: " + a);
        System.out.println("Value of b before swapping: " + b);

        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Value of a after swapping: " + a);
        System.out.println("Value of b after swapping: " + b);
    }
}
