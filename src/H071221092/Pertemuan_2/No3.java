class Produk {
    String ID;
    String nama;
    int stok;
    int harga;
    public Produk (){
    }
    public Produk (String ID, String nama, int stok, int harga ){
        this.ID = ID;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;

    }
    public String getId () {
        return ID;
    }
    public String getNama () {
        return nama;
    }
    public double getHarga () {
        return harga;
    }
    public int getStok () {
        return stok;
    }
    public boolean isAda () {
        return stok > 0;
    }
}

public class No3{
    public static void main(String[] args) {
        Produk produk1 = new Produk (); //PEMBUAT OBJEK PRODUK 1 yang PARAMETERNYA KOSONG
        produk1.ID   = "A";
        produk1.nama = "Baju";
        produk1.stok = 12;
        produk1.harga= 100000;

        // Produk produk1 = new Produk ("A", "Baju", 12, 50000); 
        Produk produk2 = new Produk ("B", "Celana", 0, 40000); // PEMBUAT OBJEK MENGGUNAKAN KONSTRAKTOR YANG DALAM PARAMETERNYA
        Produk produk3 = new Produk ("C", "Mukenah", 5, 100000); 
      

        System.out.println("ID produk 1 : " + produk1.getId());
        System.out.println("Nama Produk : " + produk1.getNama());
        System.out.println("Jumlah Stok : " + produk1.getStok());
        System.out.println("Harga: RP." + produk1.getHarga());
        System.out.printf("Cek Stok: %s\n" , produk1.isAda() ? "Tersedia" : "Barang Kosong");

        System.out.println("========================================");

        System.out.println("ID produk 2 : " + produk2.getId());
        System.out.println("Nama Produk : " + produk2.getNama());
        System.out.println("Jumlah Stok : " + produk2.getStok());
        System.out.println("Harga: RP." + produk2.getHarga());
        System.out.printf("Cek Stok: %s\n" , produk2.isAda() ? "Tersedia" : "Barang Kosong");

        System.out.println("=======================================");

        System.out.println("ID produk 3 : " + produk3.getId());
        System.out.println("Nama Produk : " + produk3.getNama());
        System.out.println("Jumlah Stok : " + produk3.getStok());
        System.out.println("Harga: RP." + produk3.getHarga());
        System.out.printf("Cek Stok: %s\n" ,produk3.isAda() ? "Tersedia" : "Barang Kosong");
    }
}