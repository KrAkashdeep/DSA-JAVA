
import java.util.*;

class ListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> s1 = new ArrayList<>();
        List<List<Integer>> s = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            s1.add(i + 1);
        }
        // System.out.println(s1);
        // s.addAll(s1);
        // for (Integer i : s1) {
        s.add(s1);
        // }
        System.out.println(s);
    }
}