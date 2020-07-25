package algoritms;

import java.util.*;

public class Algoritms {
    public static void main(String[] args) {
        revertString();
        changeLetter();
    }

    public static void revertString() {
        List<String> list = new LinkedList<>();
        list.add("dom");
        list.add("komnata");
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void changeLetter() {
        List<String> list = new ArrayList<>(Arrays.asList("Dom", "Dacha", "Tera", "Moda"));
        List<String> list2 = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            if (i % 2 != 0) {
                char[] te = list.get(i).toCharArray();
                char temp = te[0];
                te[0] = te[te.length - 1];
                te[te.length - 1] = temp;
                list2.add(new String(te));
            }
        }
        System.out.println(list2);
    }
}
