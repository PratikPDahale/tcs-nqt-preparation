package Arrays;
/*
Sort an array according to the order defined by another array

Given two arrays a1[] and a2[], sort a1[] such that elements appear in the order of a2[]. Elements not in a2[] should be placed at the end in ascending order.

Example: 

Input: a1 = [2, 1, 2, 3, 4], a2 = [2, 1, 2]
Output: [2, 2, 1, 3, 4]
Explanation: Elements 2 and 1 follow the order in a2. Remaining 3 and 4 are sorted at the end.

Input: a1 = [4, 1, 3, 3, 2], a2 = [3, 1]
Output: [3, 3, 1, 2, 4]
Explanation: Elements 3 and 1 come first as per a2. Others (2, 4) are sorted and placed after.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
Step-By-Step Approach:
1. Count frequency of each element in a1 using a hash map.
2. Add elements from a2 to the result based on their frequency.
3. Remove those elements from the map after processing.
4. Sort and add the remaining elements to the result using their frequency.
*/
public class Array22 {

    public static ArrayList<Integer> relativeSort(int[] a1, int[] a2){
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : a1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : a2){
            if(map.containsKey(num)){
                int count = map.get(num);

                while (count > 0) {
                    result.add(num);
                    count--;
                }

                map.remove(num);
            }
        }

        ArrayList<Integer> remaining = new ArrayList<>();

        for (int key : map.keySet()) {
            int count = map.get(key);
            
            while (count > 0) {
                remaining.add(key);
                count--;
            }
        }

        Collections.sort(remaining);

        result.addAll(remaining);

        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {2, 1, 2, 3, 4};
        int[] a2 = {2, 1, 2};

        ArrayList<Integer> result = relativeSort(a1, a2);

        for(int num : result){
            System.out.print(num + " ");
        }

        System.out.println();
    }
}
