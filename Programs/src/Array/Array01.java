package Array;

import java.util.stream.Stream;

public class Array01 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 0, 1, 0 };
        int icnt = 0;
        for (int i : arr) {
            if (i == 0)
                icnt++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < icnt) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        for(int i:arr)
        System.out.println(i);
    }
}
