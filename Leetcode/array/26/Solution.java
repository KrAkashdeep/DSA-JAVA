class Solution {
    public int removeDuplicates(int[] a) {

        int[] temp = new int[a.length];
        int j = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[a.length - 1];
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
        return j;

    }
}