public class Butterfly {
    public static void main(String[] args) {
        int n = 5;
        // upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                // for star print of left side
                System.out.print("*");
            for (int j = 1; j <= 2 * (n - i); j++)
                // for space between stars
                System.out.print(" ");
            // for star print of right side
            for (int k = 1; k <= i; k++)
                System.out.print("*");

            System.out.println();
        }

        // lower half
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++)
                // for star print of left side
                System.out.print("*");
            for (int j = 1; j <= 2 * (n - i); j++)
                // for spaced between stars
                System.out.print(" ");
            // for star print of right side
            for (int k = 1; k <= i; k++)
                System.out.print("*");

            System.out.println();
        }
    }

}
