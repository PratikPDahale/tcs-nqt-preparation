package Strings;
/*
Calculate sum of all numbers present in a string

Given a string S containing alphanumeric characters, The task is to calculate the sum of all numbers present in the string.

Examples: 
Input:  1abc23
Output: 24
Explanation: 1 + 23 = 24

Input:  geeks4geeks
Output: 4

Input:  1abc2x30yz67
Output: 100
*/
/*
Scan each character of the input string and if a number is formed by consecutive 
characters of the string, then increment the result by that amount. 
The only tricky part of this question is that multiple consecutive digits
 are considered one number.

 Follow the below steps to implement the idea:
Create an empty string temp and an integer sum.
Iterate over all characters of the string.
If the character is a numeric digit add it to temp.
Else convert temp string to number and add it to sum, empty temp.
Return sum + number obtained from temp.
*/
public class String7 {
    static int findSum(String str){
        String temp = "0";

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                temp += ch;
            }else{
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }
    public static void main(String[] args) {
        String str = "12abc20yz68";

        System.out.println(findSum(str));
    }
}
