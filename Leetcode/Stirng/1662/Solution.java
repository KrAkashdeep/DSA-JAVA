//CHECK IF TWO STRING ARRAY ARE EQUAL

class Solution {
    public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        String a = w1[0];
        String b = w2[0];
        for (int i = 1; i < w1.length; i++) {
            a = a.concat(w1[i]);
        }
        for (int i = 1; i < w2.length; i++) {
            b = b.concat(w2[i]);
        }
        if (a.equals(b))
            return true;
        return false;
    }
}