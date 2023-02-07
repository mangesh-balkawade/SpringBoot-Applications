public class XPattern {
    public static void main(String[] args) {
        int row = 5;
        boolean flag = true;
        int col = row * 2 - 1;
        int icnt1 = 1;
        for (int i = 1; i <= col; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == j || (i + j) == (row * 2)) {
                    System.out.print(icnt1);
                } else {
                    System.out.print(" ");
                }
            }
            if (icnt1 == row) {
                flag = false;
            }
            if (flag == false)
                icnt1--;
            if (flag == true)
                icnt1++;
            System.out.println();
        }
    }
}
