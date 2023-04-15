package H071221088.Pertemuan_2;

class Alamat {

    String jalan;
    String kota;

    public String getAlamatLengkap() {
        return jalan + "," + kota;
    }
}

class Mahasiswa {

    String nama;
    String nim;
    Alamat alamat;

    public String getnama() {
        return nama;
    }

    public String getnim() {
        return nim;
    }

    public Alamat getAlamat() {
        return alamat;
    }
}

public class No5 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Hertasning City";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Fauzan Baihaqi";
        mahasiswa.nim = "H071221088";

        System.out.println("Nama: " + mahasiswa.getnama());
        System.out.println("Nim: " + mahasiswa.getnim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}