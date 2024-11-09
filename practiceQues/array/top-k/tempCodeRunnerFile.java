     for (int i = 0; i < a.length; i++) {

            hs.computeIfAbsent(a[i], l -> l + 1);
        