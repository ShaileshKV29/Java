public class Two_Var_in_one_byte {
    public static void main(String[] args) {
        byte a = 5, b = 9;
        byte c = 0;
        System.out.println("Value of c: " + c);
        c = (byte)(a | c);
        System.out.println("Value of c: " + c);
        b = (byte)(b<<4);
        System.out.println("Value of b: " + b);
        c = (byte)(c | b);
        System.out.println("Value of c: " + c);
        System.out.println("\nNow ot get the value of a from c");
        System.out.println((c&0b11110000)>>4);

    }
}
