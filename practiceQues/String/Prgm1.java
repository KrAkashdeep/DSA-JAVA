import java.util.*;

class Prgm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "qweu2as1";
        int sum = 0;
        StringBuilder ss = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                ss.append(ch);
            } else if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }
        char[] sl = ss.toString().toCharArray();
        Arrays.sort(sl);
        String sn = new String(sl);
        System.out.println(sn + sum);

    }
}