package Strings;

import java.util.Scanner;

/*
Program to remove vowels from a String

Given a string, remove the vowels from the string and print the string without vowels. 

Examples: 

Input : welcome to geeksforgeeks
Output : wlcm t gksfrgks

Input : what is your name ?
Output : wht s yr nm ?
*/
public class String2 {
    private static String remVowels(String str){
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e'
                || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                || str.charAt(i) == 'u' || str.charAt(i) == 'A'
                || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                || str.charAt(i) == 'O' || str.charAt(i) == 'U'
            ){
                continue;
            }else{
                res += str.charAt(i);
            }
        }
        return res;
    }

    private static String remVowel(String str){
        return str.replaceAll("[aeiouAEIOU]", "");
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            System.out.println(remVowels(str));
            System.out.println(remVowel(str));
        }
    }
}
