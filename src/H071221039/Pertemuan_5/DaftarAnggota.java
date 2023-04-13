package H071221039.Pertemuan_5;
public class DaftarAnggota {
    private String nama;
    private String jenisKelamin;
    private String alamat;
    private String telepon;
    
    public DaftarAnggota(String nama, String jenisKelamin, String alamat, String telepon) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat: " + alamat);
        System.out.println("Telepon: " + telepon);
    }
}

class PengurusInti extends DaftarAnggota {
    private String jabatan;
    private String masaJabatan;
    
    public PengurusInti(String nama, String jenisKelamin, String alamat, String telepon, String jabatan, String masaJabatan) {
        super(nama, jenisKelamin, alamat, telepon);
        this.jabatan = jabatan;
        this.masaJabatan = masaJabatan;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Jabatan: %s%nMasa Jabatan: %s", jabatan, masaJabatan);
    }
}

class KoordinatorBidangDanStaff extends DaftarAnggota {
    private String bidang;
    private String tugas;
    
    public KoordinatorBidangDanStaff(String nama, String jenisKelamin, String alamat, String telepon, String bidang, String tugas) {
        super(nama, jenisKelamin, alamat, telepon);
        this.bidang = bidang;
        this.tugas = tugas;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Bidang: %s%nTugas: %s",bidang,tugas);
    }
}
