package H071221087.Pertemuan_2;
class Alamat{
    String jalan;
    String kota;

    String getAlamatLengkap(){
        String getKota = jalan+ ", "+ kota;
        return getKota;
    }
}

class Mahasiswa{
    String nama;
    String nim;
    Alamat alamat;

    String getNama(){
        String namaku = nama;
        return namaku;
    }
    String getNim(){
        String nimku = nim;
        return nimku;
    }
    Alamat getAlamat(){
        return alamat;
    }
}

public class No5 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Kapasa";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Muhammad iqbal";
        mahasiswa.nim = "H071221087";

        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("Nim : " + mahasiswa.getNim());
        System.out.println("Alamat : " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}
