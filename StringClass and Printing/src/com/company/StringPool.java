package com.company;

public class StringPool {
    public static void main(String[] args) {
        String str1 = "Java";
        System.out.println(str1);

        String str2 = new String("Java");
        System.out.println(str2);

        char c[] = {'A', 'B', 'C', 'D', 'E'};
        String str3 = new String(c);
        System.out.println(str3);

        byte b[] = {65,66,67,68,69};
        String str4 = new String(b);
        System.out.println(str4);
    }
}
