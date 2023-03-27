// pembuatan class
class Alamat{
    // attribute
    String jalan;
    String kota;

    String getAlamatLengkap(){ 
        return jalan + ", " + kota;
    }
}

// pembuatan class
class Mahasiswa{
    // attribute
    Alamat alamat;
    String nama;
    String nim;

    String getNama(){ // getNama untuk mencetak nama
        return nama;
    }

    String getNim(){ // getNim untuk mencetak NIM
        return nim;
    }

    public Alamat getAlamat(){ // pemanggilan objek class alamat untuk mencetak alamat 
        return alamat;
    } 
}

// pembuatan class utama
public class No5 {
    // pembuatan class main untuk memanggil class alamat dan mahasiswa
    public static void main(String[] args) {
        // pemanggilan objek
        Mahasiswa mahasiswa = new Mahasiswa();
        Alamat alamat = new Alamat();
        alamat.jalan = "BTP Blok A";
        alamat.kota = "Makassar";
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Khaekal";
        mahasiswa.nim = "H071221039";

        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("NIM : " + mahasiswa.getNim());
        System.out.println("Alamat : " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}
