public class INvHPNum {
    public static void main(String[] args) {
        int n = 5;
        // for (int i = n; i > 0; i--) {
        for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <= i; j++) {
            for (int j = 1; j <= n - i + 1; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
