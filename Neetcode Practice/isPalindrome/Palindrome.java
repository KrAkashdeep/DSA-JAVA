// import java.util.regex.*;

class Palindrome {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String a = sc.nextLine();
        // a.trim();
        // System.out.println(a);
        // for (int i = 0; i < a.length(); i++) {
        // if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
        // System.out.println("Not a palindrome");
        // }
        // }
        // System.out.println(" a palindrome");
        // String g = "asdfghjkl23456789?&^%$#@";
        // System.out.println("before replace " + g);
        // g.replaceAll("[^a-z]", "");
        // System.out.println("after replace " + g);
        int a = 0;
        String s = "Paaa";
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                a = 1;
            }
        }
        if (a == 1)
            System.out.println("not palindrome");
        else
            System.out.println("palindrome");
        // System.out.println(s);
    }
}
