class Alamat {
    String jalan;
    String kota;

    public String getAlamatLengkap(){
        return this.jalan + "," + this.kota;
    }
}

class Mahasiswa {
    Alamat alamat;
    String nama;
    String nim;

    public Alamat getAlamat  () {
        return this.alamat;
    }

    public String getNama() {
        return this.nama;
    }
    
    public String getNim () {
        return this.nim;
    }
}

public class No5 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat () ;
        alamat.jalan = "mana saja";
        alamat.kota = "Kota Makassar";

        Mahasiswa mahasiswa = new Mahasiswa ();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Fara Aulia Al Aini Syam";
        mahasiswa.nim = "H071221092";    

        System.out.println("Nama   : " + mahasiswa.getNama());
        System.out.println("Nim    : " + mahasiswa.getNim());
        System.out.println("Alamat : " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}