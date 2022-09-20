package Problem2;

import java.util.LinkedHashSet;
import java.util.Set;
public class AngkaMunculSekali {
    public static void main(String[] args) {
        Set<Integer> angka = new LinkedHashSet<>();

        angka.add(7);
        angka.add(6);
        angka.add(5);
        angka.add(2);
        angka.add(3);
        angka.add(7);
        angka.add(5);
        angka.add(2);

        angka.remove(7);
        angka.remove(5);
        angka.remove(2);


        System.out.println(angka);


    }

}
