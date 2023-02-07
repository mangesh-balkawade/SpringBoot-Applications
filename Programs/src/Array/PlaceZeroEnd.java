package Array;

class PlaceZeroEnd {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 0, 4, 0, 2, 3, 0, 3 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}