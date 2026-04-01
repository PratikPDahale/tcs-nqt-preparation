package Strings;
/*
Reverse a String in Java

In Java, reversing a string means rearranging its characters from last to first.
It’s a common programming task used in algorithms, data processing,
and interviews. There are several ways to reverse a string in Java,
from using loops to built-in methods.
 */
public class String6 {
    static String reverse(String str){
        char[] arr = str.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String str = "Geeks";

        System.out.println(reverse(str));
    }
}
