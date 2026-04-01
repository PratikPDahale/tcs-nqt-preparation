package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Sort elements by frequency

Given an array of integers arr[], sort the array according to the frequency of elements, 
i.e. elements that have higher frequency comes first. If the frequencies of two elements 
are the same, then the smaller number comes first.

Examples:  

Input: arr[] = [5, 5, 4, 6, 4]
Output: [4, 4, 5, 5, 6]
Explanation: The highest frequency here is 2. Both 5 and 4 have that frequency. 
Now since the frequencies are the same the smaller element comes first. 
So 4 comes first then comes 5. Finally comes 6. The output is 4 4 5 5 6.

Input: arr[] = [9, 9, 9, 2, 5]
Output: [9, 9, 9, 2, 5]
Explanation: The highest frequency here is 3. Element 9 has the highest frequency So 9 comes first. 
Now both 2 and 5 have the same frequency. So we print smaller elements first. The output is 9 9 9 2 5.
*/
/*
Using Sorting - O(n * log n) Time and O(n) Space
The idea is to use sorting to arrange the similar elements together, 
the count frequencies using linear traversal.  Store frequencies and items in a 2d array of elements. 
Finally sort this 2d array according to the frequency of each element. 
*/
public class Array21 {
    static ArrayList<Integer> sortByFreq(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> freq = new ArrayList<>();

        Comparator<ArrayList<Integer>> comp = new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
                if (a.get(0).equals(b.get(0)))
                    return a.get(1) - b.get(1);
                return b.get(0) - a.get(0);
            }
        };

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            while (i < n - 1 && arr[i] == arr[i + 1]) {
                cnt++;
                i++;
            }

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(cnt);
            temp.add(arr[i]);
            freq.add(temp);
        }

        Collections.sort(freq, comp);

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < freq.size(); i++) {
            int count = freq.get(i).get(0);
            int value = freq.get(i).get(1);
            for (int j = 0; j < count; j++) {
                ans.add(value);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 5, 4, 6, 4 };
        ArrayList<Integer> ans = sortByFreq(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
