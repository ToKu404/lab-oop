package H071221088.Pertemuan_3;

class Peluru {
    String kaliber;
    String kecepatanPeluru;
    int stock;

    public String getDetailPeluru() {
        return "kaliber "+ kaliber + " dengan kecepatan " + kecepatanPeluru;
    }

    public int stock() {
        return stock;
    }
}


class Pistol {
    String nama;
    int harga;
    String perlengkapan;
    Peluru peluru;

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setharga(int harga) {
        this.harga = harga;
    }

    public void setperlengkapan(String perlengkapan) {
        this.perlengkapan = perlengkapan;
    }

    public Peluru getPeluru() {
        return peluru;
    }
    
    public void dataSenjata() {
        System.out.println("- SENJATA -");
        System.out.println("Jenis = Pistol");
        System.out.println("Nama = " + nama);
        System.out.println("Harga = $" + harga);
        System.out.println("Perlengkapan = " + perlengkapan);
    }

    public void terjual() {
        int b = peluru.stock -= 1;
        System.out.println();
        System.out.println(nama + " terjual seharga $" + harga);
        System.out.println("Stok yang tersedia = " + b);
    }
}

public class No1 {
    public static void main(String[] args) {
        Peluru peluru1 = new Peluru();
        peluru1.kaliber = "9 x 9 mm";
        peluru1.kecepatanPeluru = "20ms";
        peluru1.stock = 5;

        Pistol pistol1 = new Pistol();
        pistol1.setnama("Glock 18");
        pistol1.setharga(85);
        pistol1.setperlengkapan("muzzle and sight");
        pistol1.peluru = peluru1;

        pistol1.dataSenjata();
        System.out.println("Peluru = " + pistol1.getPeluru().getDetailPeluru());
        pistol1.terjual();
    }
}