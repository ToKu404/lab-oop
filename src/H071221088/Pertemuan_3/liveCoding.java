package H071221088.Pertemuan_3;

class ObjekWisata {
    String nama;
    String lokasi;
    int pengunjung;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public int getPengunjung() {
        return pengunjung;
    }

    public void setPengunjung(int pengunjung) {
        this.pengunjung = pengunjung;
    }

    public ObjekWisata(String nama, String lokasi, int pengunjung) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.pengunjung = pengunjung;
    }

    public ObjekWisata() {
        this.nama = "";
        this.lokasi = "";
        this.pengunjung = 0;
    }

    public boolean isPopular() {
        return pengunjung >= 100;
    }

public class liveCoding {
    public static void main(String[] args) {
        ObjekWisata objekwisata1 = new ObjekWisata("Pantai Galesong", "Gowa", 150);
        ObjekWisata objekwisata2 = new ObjekWisata();

        objekwisata2.setNama("CPI");
        objekwisata2.setLokasi("Makassar");
        objekwisata2.setPengunjung(0);

        System.out.println(objekwisata1.getNama());
        System.out.println(objekwisata1.getLokasi());
        System.out.println(objekwisata1.getPengunjung());
    }
}



    




    
}
