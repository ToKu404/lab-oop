package H071221066.Pertemuan_3;

class Mahasiswa {
    String nama;
    String nim;

    public String getNamaMahasiswa() {
        return nama;
    }
    public String getNim(){
        return nim;
    }
}
class RekapNilai {
    // Atribut
    Mahasiswa mahasiswa;
    private int nilai;
    private String keterangan;

    // Konstruktor 1
    public RekapNilai(Mahasiswa mahasiswa, int nilai) {
        this.mahasiswa = mahasiswa;
        this.nilai = nilai;
    }

    // Konstruktor 2
    public RekapNilai(Mahasiswa mahasiswa, int nilai, String keterangan) {
        this.mahasiswa = mahasiswa;
        this.nilai = nilai;
        this.keterangan = keterangan;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    // Behavior 1 : Mengembalikan peringkat berdasarkan nilai
    public char hitungPeringkat() {
        if (nilai >= 95) {
            return 'A'  ;
        } else if (nilai >= 85) {
            return 'B';
        } else if (nilai >= 75) {
            return 'C';
        } else if (nilai >= 65) {
            return 'D';
        } else {
            return 'E';
        }
    }

    // Behavior 2 : Menambah nilai pada objek
    public void tambahNilai(int nilaiTambahan) {
        nilai += nilaiTambahan;
        nilai = nilai > 100 ? 100 : nilai;
    }

    // Menampilkan informasi siswa
    public void tampilInfo() {
        System.out.println("Nama : " + mahasiswa.getNamaMahasiswa()); 
        System.out.println("Nilai : " + nilai);
        System.out.println("Predikat : " + hitungPeringkat());
        System.out.println("Keterangan : " + keterangan + "\n") ;
    }
}

public class No1 {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Yani";
       
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Naya";

        RekapNilai rekapMahasiswa2 = new RekapNilai(mahasiswa2 , 99);
        RekapNilai rekapMahasiswa = new RekapNilai(mahasiswa , 66);
        
        rekapMahasiswa.setKeterangan("Perlu ditingkatkan!");
        System.out.println("------------INFORMASI PERTAMA------------");
        rekapMahasiswa.tampilInfo();

        rekapMahasiswa.tambahNilai(25);
        System.out.println("------------SETEAH PENAMBAHAN NILAI------------");

        rekapMahasiswa.setKeterangan("Tetap pertahankan!");
        rekapMahasiswa.tampilInfo();

        rekapMahasiswa2.setKeterangan("Perlu ditingkatkan!");
        System.out.println("------------INFORMASI PERTAMA------------");
        rekapMahasiswa2.tampilInfo();

        rekapMahasiswa2.tambahNilai(25);
        System.out.println("------------SETEAH PENAMBAHAN NILAI------------");

        rekapMahasiswa2.setKeterangan("Tetap pertahankan!");
        rekapMahasiswa2.tampilInfo();
    }
}

