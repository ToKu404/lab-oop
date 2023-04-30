package H071221028.Pertemuan_5.No1;

public class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(3, 2, 4);
        System.out.println(segitiga.luas());
        System.out.println(segitiga.keliling());

        Kubus kubus = new Kubus(6);
        System.out.println(kubus.volume());
        System.out.println(kubus.luasPermukaan());
    }
}
