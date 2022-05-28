package com.company;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = 0;
        int j = str.length() - 1;
        boolean pallindrome = false;
        while(i < j)
        {
            if(str.charAt(i) == str.charAt(j))
                pallindrome = true;
            else {
                pallindrome = false;
                break;
            }

            i++;j--;
        }

        if(pallindrome)
            System.out.println("Pallindrome");
        else
            System.out.println("Not Pallindrome");
    }
}
