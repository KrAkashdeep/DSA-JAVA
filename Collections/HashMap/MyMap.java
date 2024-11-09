import java.util.HashMap;

public class MyMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hs = new HashMap<>();

        hs.put(1, 99);
        hs.put(2, 199);
        hs.put(3, 299);
        // System.out.println(hs);
        System.out.println(hs.get(2));
        System.out.println(hs);
        for (int i = 0; i < 5; i++) {

            if (hs.containsKey(i)) {
                // int a = hs.get(2);
                hs.put(i, (hs.get(i)) + 111);

            } else {
                hs.put(i, 111);
            }
        }
        hs.remove(4);
        System.out.println(hs.containsValue(111));

        HashMap<Integer, Integer> h = new HashMap<>();

        h.put(1, 99);
        h.put(2, 199);
        h.put(3, 299);
        System.out.println(hs.equals(h));

        System.out.println(hs.getOrDefault(2, 5868667));

        System.out.println(hs.values());
        for (Integer i : hs.keySet()) {
            System.out.print(hs.get(i) + " ");
        }

    }

}
