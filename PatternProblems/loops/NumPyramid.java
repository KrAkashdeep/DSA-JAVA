public class NumPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n - 1; j++) {
                // for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
                System.out.print(i + " ");
            System.out.println();
        }
    }

}