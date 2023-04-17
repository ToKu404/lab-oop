public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(2);
        System.out.println(persegi.keliling());
        System.out.println(persegi.luas());

        Kubus kubus = new Kubus(2);
        System.out.println(kubus.luasPermukaan());
        System.out.println(kubus.volume());
    }
}
