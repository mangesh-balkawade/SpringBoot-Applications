package Array;

import java.util.*;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2, 3, 4, 5 };
        List<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    list1.add(arr[i]);
            }
        }

        list1.forEach(e -> System.out.println(e));
        List<Integer> list2 = new ArrayList<Integer>();

        Set<Integer> set1 = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set1.contains(arr[i]))
                list2.add(arr[i]);
            else
                set1.add(arr[i]);

        }
        list2.forEach(e -> System.out.println(e));
    }
}
