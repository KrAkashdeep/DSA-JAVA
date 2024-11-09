class Solution {
    public String defangIPaddr(String address) {
        String s = address.replace(".", "[.]");
        return s;
    }

    public static void main(String[] arg) {
        Solution s = new Solution();

        System.out.println(s.defangIPaddr("1.10.12.11"));
    }
}

// replace the "." wiht "[.]"