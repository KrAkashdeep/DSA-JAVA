class Prbm {

    public static int countSetBits(int n) {

        // Your code here
        int c = 0;
        for (int i = 1; i <= n; i++) {

            int k = i;
            while (k != 0) {
                if ((k & 1) == 1)
                    c++;
                k = k >> 1;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int a = countSetBits(4);
        System.out.println(a);
    }
}