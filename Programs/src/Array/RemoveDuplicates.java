package Array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 4, 4, 4, 5, 6, 7, 8 };
        Set<Integer> dupremove = new HashSet<>();
        int temparr1[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            dupremove.add(arr[i]);
            if (arr[i] != arr[i + 1]) {
                temparr1[j] = arr[i];
                j++;
            }
        }
        if (arr[arr.length - 1] != arr[arr.length - 2])
            temparr1[j] = arr[arr.length - 1];
        // for (int i : temparr1)
        // System.out.println(i);

        dupremove.forEach(e -> System.out.print(e));

    }
}
