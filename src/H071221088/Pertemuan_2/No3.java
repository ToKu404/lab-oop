package H071221088.Pertemuan_2;

class Produk {
    String Nama;
    int Id;
    int Harga;
    int Stock;

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public void CekProduk() {
        System.out.println("Nama = " + Nama);
        System.out.println("Nomor Id = " + Id);
        System.out.println("Harga = " + Harga);
        System.out.println("Stock = " + Stock);
        if (Stock > 0) {
            System.out.println("Produk masih tersedia");
        }
        else {
            System.out.println("Produk tidak tersedia");
        }
    }
}

public class No3 {
    public static void main(String[] args) {
        Produk Produk1 = new Produk();
        Produk produk2 = new Produk();
        Produk1.setNama("Baju");
        Produk1.setId(01);
        Produk1.setHarga(50000);
        Produk1.setStock(10);
        
        Produk1.CekProduk();

        System.out.println("");
        
        produk2.setNama("Celana");
        produk2.setId(02);
        produk2.setHarga(75000);
        produk2.setStock(0);

        produk2.CekProduk();
    }
}