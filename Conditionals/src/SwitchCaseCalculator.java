import java.util.Scanner;

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter 2 Numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Options are:");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("Choose Any Option by writing it: ");
        Scanner sc2 = new Scanner(System.in);
        String option = sc2.next();

        switch (option)
        {
            case "ADD":
                System.out.println(a+b);
                break;
            case "SUB":
                System.out.println(a-b);
                break;
            case "MUL":
                System.out.println(a*b);
                break;
            case "DIV":
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid Numbers");
                break;
        }
    }
}
