package Problem2;

import java.util.LinkedHashSet;
import java.util.Set;
public class AngkaMunculSekali2 {
    public static void main(String[] args) {
        Set<Integer> angka = new LinkedHashSet<>();

        angka.add(1);
        angka.add(1);
        angka.add(2);
        angka.add(2);


        angka.remove(1);
        angka.remove(2);


        System.out.println(angka);

    }
}
