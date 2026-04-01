package Strings;
/*
Remove all characters other than alphabets from string
Given a string consisting of alphabets and others characters, remove all the characters other than alphabets and print the string so formed.

Examples:

Input : $Gee*k;s..fo, r'Ge^eks?
Output : GeeksforGeeks

Input : P&ra+$BHa;;t*ku, ma$r@@s#in}gh
Output : PraBHatkumarsingh
 */

public class String5 {
    public static void main(String[] args) {
        String str = "$Gee*k;s..fo, r'Ge^eks?";
        System.out.println(str.replaceAll("[^a-zA-Z]", ""));
    }
}
