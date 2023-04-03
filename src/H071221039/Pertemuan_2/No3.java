package H071221039.Pertemuan_2;
// pembuatan class
class Produk {
    // attribute
    int id;
    String nama;
    int stok;
    int harga;

    // membuat method untuk mencetak data produk
    void dataProduk(){
        System.out.println("Id : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("Stok : " + stok);
        System.out.println("Harga : "+ harga);
    }
    // membuat method untuk mencetak informasi stok produk
    void stokInformasi(){
        if (stok > 0){
            System.out.println("Stok masih ada");
        } else{
            System.out.println("Stok kosong");
        }
    }
}
// pembuatan class utama
public class No3{
    // pembuatan class main untuk memanggil objek produk
    public static void main(String[] args) {
        // pemanggilan objek sepatu
        Produk produk = new Produk();
        produk.id = 12345;
        produk.nama = "Nike";
        produk.stok = 0;
        produk.harga = 12000;
        produk.dataProduk();
        produk.stokInformasi();
    }
}
