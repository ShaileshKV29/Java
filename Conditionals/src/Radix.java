import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();

        if(num1.matches("[01]+"))
            System.out.println("Binary");
        else if(num1.matches("[0-7]+"))
            System.out.println("Octal");
        else if(num1.matches("[0-7A-Fa-f]+"))
            System.out.println("HexaDecimal");
        else if(num1.matches("[0-9]+"))
            System.out.println("Decimal Number");
        else
            System.out.println("Not a number");


    }
}
