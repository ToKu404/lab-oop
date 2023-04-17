public class ProgrammerUnhas {
    String nama;
    int umur;
    String alamat;
    
    public ProgrammerUnhas(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

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
}

class PengurusInti extends ProgrammerUnhas{
    String jabatan;

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public PengurusInti(String nama, int umur, String alamat, String jabatan) {
        super(nama, umur, alamat);
        this.jabatan = jabatan;
    }
}

class KoordinatorBidang extends ProgrammerUnhas{
    String bidang;

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public KoordinatorBidang(String nama, int umur, String alamat, String bidang) {
        super(nama, umur, alamat);
        this.bidang = bidang;
    }
}

class Staf extends ProgrammerUnhas{
    int gaji;

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public Staf(String nama, int umur, String alamat, int gaji) {
        super(nama, umur, alamat);
        this.gaji = gaji;
    }

}