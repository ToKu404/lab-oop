public class Main {
    public static void main(String[] args) {
       Persegi persegi = new Persegi(10);
       System.out.println(persegi.getKeliling());
       System.out.println(persegi.getLuas());
    

       Tabung tabung = new Tabung(10, 15);
       System.out.println(tabung.getLuaspermukaan());
       System.out.println(tabung.getVolume());
    }
}
