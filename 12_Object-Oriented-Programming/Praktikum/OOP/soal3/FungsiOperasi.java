package OOP.soal3;
import java.util.Scanner;
public class FungsiOperasi {
    private static int Penjumlahan;
    private static int hasil;
    private static int Pengurangan;
    private static int Perkalian;
    private static int Pembagian;

    public static void main(String[] args) {
        Penjumlahan tambah = new Penjumlahan();
        Pengurangan kurang = new Pengurangan();
        Perkalian kali = new Perkalian();
        Pembagian bagi = new Pembagian();

        static int bilangan1;
        static int bilangan2;

        Scanner bil1 = new Scanner(System.in);
        Scanner bil2 = new Scanner(System.in);

        System.out.println("Masukan bilngan 1 : ");
        bilangan1 = bil1.nextInt();

        System.out.println("Masukan bilngan 2 : ");
        bilangan2 = bil2.nextInt();

        System.out.println(hasil + Penjumlahan);
        System.out.println(hasil + Pengurangan);
        System.out.println(hasil + Perkalian);
        System.out.println(hasil + Pembagian);
    }
}
