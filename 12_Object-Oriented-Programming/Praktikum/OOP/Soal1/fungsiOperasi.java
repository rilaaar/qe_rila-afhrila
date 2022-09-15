package OOP.Soal1;

public class fungsiOperasi {
    public static float luas;
    public static float keliling;

    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Segitiga segitiga = new Segitiga();


        System.out.println(Persegi.luas);
        System.out.println(persegi.keliling);

        System.out.println(segitiga.luas);
        System.out.println(segitiga.keliling);

        System.out.println(persegiPanjang.luas);
        System.out.println(persegiPanjang.keliling);


    }
}
