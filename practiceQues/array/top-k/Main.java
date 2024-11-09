
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int a[] = { 1, 1, 1, 1, 2, 2, 3, 9 };
        int k = 2;
        Map<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < a.length; i++) {

            if (hs.containsKey(a[i])) {
                int v = hs.get(a[i]);
                hs.put(a[i], v + 1);
            } else {
                hs.put(a[i], 1);
            }
        }
        for (int i = 0; i < hs.size(); i++) {
         

        }
    }
}
