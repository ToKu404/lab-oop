package H071221039.Pertemuan_2;
class Sepatu { // pembuatan class
    // attribute
    String merk; 
    int ukuran;
    String warna;

    // membuat method untuk mencetak tipe sepatu
    void tipeSepatu(){
        System.out.println("Merk : " + merk);
        System.out.println("Ukuran : " + ukuran);
        System.out.println("Warna : " + warna);
    }
    // membuat method tambahan
    void soldOut(){
        System.out.println("Sold out");
    }
}
// pembuatan class utama
public class No1 {
    // pembuatan class main untuk memanggil objek sepatu
    public static void main(String[] args) {
        // pemanggilan objek sepatu
        Sepatu sepatu = new Sepatu();
        sepatu.merk = "Mills";
        sepatu.ukuran = 41;
        sepatu.warna = "Putih";
        sepatu.tipeSepatu();
        
    }
}



