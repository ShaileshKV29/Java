package com.company;

public class StringMethods {
    public static void main(String[] args) {
        String str = "    Welcome    ";
        str = str.trim();
        System.out.println(str);
        String str1 = str.substring(2, 3);
        System.out.println(str1);

        String str2 = "Shailesh Kumar Verma";
        System.out.println(str2.startsWith("Shailesh"));
        System.out.println(str2.endsWith("Verma"));

        String str3 = String.valueOf(10.5f+20);
        System.out.println(str3);
        
    }
}
