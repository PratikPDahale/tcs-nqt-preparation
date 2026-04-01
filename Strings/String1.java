package Strings;

import java.util.Scanner;

/*
Program to Check for Palindrome

A string is said to be palindrome if the reverse of the string is the same as the string. 
In this article, we will learn how to check whether the given string is palindrome or not.
*/
public class String1 {
    private static boolean isPalindrome(String str){
        str = str.replaceAll("\\s", "").toLowerCase();
        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++; end--;
        }
        return true;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            
            System.out.println("It String Palindrome ? : " + isPalindrome(str));
        }
    }
}
