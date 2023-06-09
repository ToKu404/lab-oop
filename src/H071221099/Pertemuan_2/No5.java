class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat; 

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public Alamat getAlamat() {
        return alamat;
    }
}

class Alamat {
    String jalan;
    String kota;


    public String getAlamatLengkap() {
        return jalan + ", " + kota;
    }
}

public class No5 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Sudiang Planet";
        alamat.kota = "Makassar City";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Muhammad Fathan Tsaqib";
        mahasiswa.nim =  "H071221099";
        
        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("Nim : " + mahasiswa.getNim());
        System.out.println("Alamat : " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}
