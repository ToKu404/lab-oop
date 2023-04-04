
public class Quiz {
    public static void main(String[] args) {
        Utils.selfDisplay();
        Pesanan pesanan1 = new Pesanan("ayam", "minasa upa");
        pesanan1.setNamaPesanan("ayam");
        pesanan1.setAlamatPemesanan("minasa upa");
        pesanan1.setTotalHarga(1000);
    }
}

class Pesanan {
     String namaPesanan;
     String alamatPemesanan;
     double totalHarga;

    public String getNamaPesanan() {
        return namaPesanan;
    }

    public void setNamaPesanan(String namaPesanan) {
        this.namaPesanan = namaPesanan;
    }

    public String getAlamatPemesanan() {
        return alamatPemesanan;
    }

    public void setAlamatPemesanan(String alamatPemesanan) {
        this.alamatPemesanan = alamatPemesanan;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public Pesanan (String namaPesanan, String alamatPemesanan) {
        this.namaPesanan = namaPesanan;
        this.alamatPemesanan = alamatPemesanan;
    }
}

    // public void Pesanan (double totalHarga) {
    //     this.totalHarga = totalHarga;
    // }



class Utils {
    public static void selfDisplay() {
        String nama = "awa";
        String nim = "H071221028";
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
    
