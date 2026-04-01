package Strings;
/*
Bingu was testing all the strings he had at his place and found that most of them 
were prone to a vicious attack by Banju, his arch-enemy. Bingu decided to encrypt 
all the strings he had, by the following method. Every substring of identical letters 
is replaced by a single instance of that letter followed by the number of occurrences 
of that letter. Then, the string thus obtained is further encrypted by reversing it.

Example 1:

Input:
s = "aabc"
Output: 1c1b2a
Explanation: aabc
Step1: a2b1c1
Step2: 1c1b2a
Example 2:

Input:
s = "aaaaa"
Output: 5a
Explanation: aaaaa
Step 1: a5
Step 2: 5a
*/
public class String15 {
    static String encryptString(String s){
        StringBuilder compressed = new StringBuilder();

        int count = 1;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1))  count++;

            else{
                compressed.append(s.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }

        compressed.append(s.charAt(s.length() - 1));
        compressed.append(count);

        return compressed.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "aabc";

        System.out.println(encryptString(s));
    }
}
