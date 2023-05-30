public class Main {
    public static void main(String[] args) {
        System.out.println("===== BANGUN RUANG =====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.println("===== BANGUN RUANG =====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. SEGITIGA");
        System.out.println("9. TRAPESIUM");
        System.out.println("10. KELUAR");

        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan pilihan: ");
        int bangun = sc.nextInt();

            switch (bangun){
                case 1:
                    Kubus kubus = new Kubus (7);
                    System.out.println("LP     : " + kubus.getLuasPermukaan());
                    System.out.println("Volume : " + kubus.getVolume());
                        break;
                case 2:
                    Balok balok = new Balok (9);
                    System.out.println("LP     : " + balok.getLuasPermukaan());
                    System.out.println("Volume : " + balok.Volume);
                        break;
                case 3:
                    Bola bola = new Bola (3);
                    System.out.println("LP     : " + bola.getLuasPermukaan());
                    System.out.println("Volume : " + bola.Volume());
                        break;
                case 4:
                    Tabung tabung = new Tabung (11);
                    System.out.println("LP     : " + tabung.getLuasPermukaan());
                    System.out.println("Volume : " + tabung.getVolume);
                        break;
                case 5:
                    Persegi persegi = new Persegi(2);
                    System.out.println("Luas     : " + persegi.getLuas());
                    System.out.println("Keliling : " + persegi.getKeliling());
                        break;
                case 6:
                    PersegiPanjang persegipanjang = new PersegiPanjang(3,4);
                    System.out.println("Luas     : " + persegipanjang.getLuas());
                    System.out.println("Keliling : " + persegipanjang.getKeliling());
                        break;
                case 7:
                    Lingkaran lingkaran = new Lingkaran (4);
                    System.out.println("Luas     : " + lingkaran.getLuas());
                    System.out.println("Keliling : " + lingkaran.getKeliling());
                        break;
                case 8:
                    Segitiga segitiga = new Segitiga (5,5);
                    System.out.println("Luas     : " + segitiga.getLuas());
                    System.out.println("Keliling : " + segitiga.getKeliling());
                        break;
                case 9:
                    Trapesium trapesium = new Trapesium (9,5);
                    System.out.println("Luas     : " + trapesium.getLuas());
                    System.out.println("Keliling : " + trapesium.getKeliling());
                        break;
                default:
                     System.out.println("Masukkan Angka yang tersedia");
        }
    }
}
