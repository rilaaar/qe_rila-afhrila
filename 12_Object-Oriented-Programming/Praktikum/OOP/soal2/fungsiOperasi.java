package OOP.soal2;

public class fungsiOperasi {
    public static float volume;

    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        Balok balok = new Balok();
        Tabung tabung = new Tabung();

        System.out.println(volume + kubus);
        System.out.println(volume + balok);
        System.out.println(volume + tabung); 
    }

}
