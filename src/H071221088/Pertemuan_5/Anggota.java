package H071221088.Pertemuan_5;

public class Anggota {
    String nama;
    int umur;
    String alamat;
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Anggota(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
}

class PengurusInti extends Anggota {
    String jabatan;

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public PengurusInti(String nama, int umur, String alamat, String jabatan) {
        super (nama, umur, alamat);
        this.jabatan = jabatan;
    }
}

class KoordinatorBidang extends Anggota {
    String bidang;

    public KoordinatorBidang(String nama, int umur, String alamat, String bidang) {
        super(nama, umur, alamat);
        this.bidang = bidang;
    }
}

final class Staf extends Anggota {
    String divisi;

    public Staf(String nama, int umur, String alamat, String divisi) {
        super(nama, umur, alamat);
        this.divisi = divisi; 
    }
}