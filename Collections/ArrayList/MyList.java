import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyList {
    public static void main(String[] args) {
        ArrayList<Integer> as = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 4, 7, 3));
        // int ar[] = { 8, 13, 31, 45 };
        as.add(26);
        as.add(23);
        as.add(12);
        as.add(21);
        // System.out.println(as);
        as.remove(2);
        as.addAll(a);
        // as.set(5, 799);
        // ArrayList<Integer> nal = new ArrayList<>();
        // nal = (ArrayList) as.clone();

        // System.out.println(as);
        // Collections.sort(as);

        for (int i : as) {
            System.out.print(i + " ");
        }

        // System.out.println(as.contains(3));

        // System.out.println(as.containsAll(a));

        // System.out.println(as.getClass());

        // System.out.println(as.isEmpty());
    }
}
