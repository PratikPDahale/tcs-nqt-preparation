package Strings;
/*
Program to find Smallest and Largest Word in a String

Given a string, find the minimum and the maximum length words in it. 

Examples: 
Input : "This is a test string"
Output : Minimum length word: a
         Maximum length word: string
Input : "GeeksforGeeks A computer Science portal for Geeks"
Output : Minimum length word: A
         Maximum length word: GeeksforGeeks
*/
public class String10 {
    static void findMinMiax(String s){
        String[] words = s.split(" ");

        String minWord = words[0];
        String maxWord = words[0];

        for(String word : words){
            if(word.length() < minWord.length()){
                minWord = word;
            }
            if(word.length() > maxWord.length()){
                maxWord = word;
            }
        }
        System.out.println("Minimum length word : " + minWord);
        System.out.println("Maximum length word : " + maxWord);
    }
    

    public static void main(String[] args) {
        String s = "This is a test string";
        findMinMiax(s);
    }
}
