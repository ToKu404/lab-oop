package H071221039.Pertemuan_5;
import java.util.Scanner;

class MainNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ==== BANGUN RUANG ==== ");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG\n");
        System.out.println(" ==== BANGUN DATAR ==== ");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. SEGITIGA");
        System.out.println("9. TRAPESIUM");

        System.out.print("> ");
        int pilihan = sc.nextInt();
        System.out.println(" ====================== ");
        if (pilihan == 1) {
            Kubus kubus = new Kubus();
            System.out.print("Masukkan panjang sisi : ");
            Double angka = sc.nextDouble();
            kubus.setSisi(angka);

            System.out.println("Luas Permukaan : " + kubus.hitungLuas());
            System.out.println("Volume         : " + kubus.hitungVolume());

        } else if (pilihan == 2) {
            Balok balok = new Balok();
            System.out.print("Masukkan panjang balok : ");
            Double angka1 = sc.nextDouble();
            balok.setPanjang(angka1);

            System.out.print("Masukkan lebar balok  : ");
            Double angka2 = sc.nextDouble();
            balok.setLebar(angka2);

            System.out.print("Masukkan tinggi balok : ");
            Double angka3 = sc.nextDouble();
            balok.setTinggi(angka3);

            System.out.println("Luas Permukaan : " + balok.hitungLuas());
            System.out.println("Volume         : " + balok.hitungVolume());

        } else if (pilihan == 3) {
            Bola bola = new Bola();
            System.out.print("Masukkan jari-jari bola : ");
            Double angka = sc.nextDouble();
            bola.setJari(angka);

            System.out.println("Luas Permukaan : " + bola.hitungLuas());
            System.out.println("Volume         : " + bola.hitungVolume());

        } else if (pilihan == 4) {
            Tabung tabung = new Tabung();
            System.out.print("Masukkan jari-jari tabung : ");
            Double angka1 = sc.nextDouble();
            tabung.setJari(angka1);

            System.out.print("Masukkan tinggi tabung : ");
            Double angka2 = sc.nextDouble();
            tabung.setTinggi(angka2);

            System.out.println("Luas Permukaan : " + tabung.hitungLuas());
            System.out.println("Volume         : " + tabung.hitungVolume());

        } else if (pilihan == 5) {
            Persegi persegi = new Persegi();
            System.out.print("Masukkan panjang sisi : ");
            Double angka = sc.nextDouble();
            persegi.setSisi(angka);

            System.out.println("Keliling : " + persegi.hitungKeliling());
            System.out.println("Luas     : " + persegi.hitungLuas());

        } else if (pilihan == 6) {
            PersegiPanjang persegiPanjang = new PersegiPanjang();
            System.out.print("Masukkan panjang : ");
            Double angka1 = sc.nextDouble();
            persegiPanjang.setPanjang(angka1);

            System.out.print("Masukkan lebar : ");
            Double angka2 = sc.nextDouble();
            persegiPanjang.setLebar(angka2);

            System.out.println("Keliling : " + persegiPanjang.hitungKeliling());
            System.out.println("Luas     : " + persegiPanjang.hitungLuas());

        } else if (pilihan == 7) {
            Lingkaran lingkaran = new Lingkaran();
            System.out.print("Masukkan jari-jari : ");
            Double angka = sc.nextDouble();
            lingkaran.setJari(angka);

            System.out.printf("Keliling : %.2f%n", lingkaran.hitungKeliling());
            System.out.printf("Luas     : %.2f", lingkaran.hitungLuas());

        } else if (pilihan == 8) {
            Segitiga segitiga = new Segitiga();
            System.out.print("Masukkan alas : ");
            Double angka1 = sc.nextDouble();
            segitiga.setAlas(angka1);

            System.out.print("Masukkan sisi kiri : ");
            Double angka2 = sc.nextDouble();
            segitiga.setSisikiri(angka2);

            System.out.print("Masukkan sisi kanan : ");
            Double angka3 = sc.nextDouble();
            segitiga.setSisikanan(angka3);

            System.out.print("Masukkan tinggi : ");
            Double angka4 = sc.nextDouble();
            segitiga.setTinggi(angka4);

            System.out.println("Keliling : " + segitiga.hitungKeliling());
            System.out.println("Luas     : " + segitiga.hitungLuas());

        } else if (pilihan == 9) {
            Trapesium trapesium = new Trapesium();
            System.out.print("Masukkan alas : ");
            Double angka1 = sc.nextDouble();
            trapesium.setAlas(angka1);

            System.out.print("Masukkan sisi miring : ");
            Double angka2 = sc.nextDouble();
            trapesium.setSisimiring(angka2);

            System.out.print("Masukkan atas : ");
            Double angka3 = sc.nextDouble();
            trapesium.setAtas(angka3);

            System.out.print("Masukkan tinggi : ");
            Double angka4 = sc.nextDouble();
            trapesium.setTinggi(angka4);

            System.out.println("Keliling : " + trapesium.hitungKeliling());
            System.out.println("Luas     : " + trapesium.hitungLuas());

        } else {
            System.out.println("Tidak ada dalam pilihan");
        }
        sc.close();
    }
}