package Strings;
/*
Toggle the Case of Each Character in a String

Given a string s consisting of English letters (both uppercase and lowercase), 
convert each character to its opposite case that is, change every lowercase letter
 to uppercase, and every uppercase letter to lowercase.

Examples: 

Input : s = "geeksForgEeks"
Output : "GEEKSfORGeEKS"
Explanation : All lower case characters are changed 
into upper case and vice versa.

Input : s = "capiTAlize"
Output : "CAPItaLIZE"
Explanation : All lower case characters are changed 
into upper case and vice versa.

Input : s = "SMALLcase"
Output : "smallCASE"
Explanation : All lower case characters are changed 
into upper case and vice versa.
*/
public class String13 {
    static String toggleChar(String str){
        String result = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);
            else
                result += Character.toUpperCase(ch);
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "GeEkSfOrGeEkS";
        System.out.println(toggleChar(str));
    }
}
