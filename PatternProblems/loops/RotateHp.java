public class RotateHp {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // spaace print
            // both can be used for space
            // for (int j = n - i; j > 0; j--)
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            // for star print
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
