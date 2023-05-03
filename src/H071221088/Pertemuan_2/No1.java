package H071221088.Pertemuan_2;

class Serangga {

    String namaSerangga;
    String tipeHewan;
    String kemampuan;
    int kaki;

    public void setNamaSerangga(String namaSerangga) {
        this.namaSerangga = namaSerangga;
    }
    
    public void setTipeHewan(String tipeHewan) {
        this.tipeHewan = tipeHewan;
    }

    public void setKemampuan(String Kemampuan) {
        this.kemampuan = Kemampuan;
    }

    public void setKaki(int kaki) {
        this.kaki = kaki;
    }

    public void aktivitas() {
        System.out.println(namaSerangga + " sedang " + kemampuan);
    }

    public void menampilkanData() {
        System.out.println("- SERANGGA -");
        System.out.println("Nama = " + namaSerangga);
        if (tipeHewan == "Herbivora") {
            System.out.println("Tipe = " + tipeHewan + " (Pemakan Tumbuhan)");
        }
        else if (tipeHewan == "Karnivora") {
            System.out.println("Tipe = " + tipeHewan + " (Pemakan Daging)");
        }
        else if (tipeHewan == "Omnivora") {
            System.out.println("Tipe = " + tipeHewan + " (Pemakan Segalanya)");
        }
        System.out.println("Kemampuan Khusus = " + kemampuan);
        System.out.println("Jumlah Kaki = " + kaki);
    }
}

public class No1 {
    public static void main(String[] args) {
        Serangga serangga1 = new Serangga();
        serangga1.setNamaSerangga("Lalat");
        serangga1.setTipeHewan("Omnivora");
        serangga1.setKemampuan("Terbang");
        serangga1.setKaki(6);

        serangga1.menampilkanData();
        serangga1.aktivitas();
    }
}
