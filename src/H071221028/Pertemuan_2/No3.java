class Barang {
    public int id;
    public String nama;
    public int stok;
    public double harga;

    public boolean isAvailable(){
        return this.stok > 0;
    }
}

public class No3 {
    public static void main(String[] args) {
        Barang barang = new Barang();

        barang.id = 071221;
        barang.nama = "kitkat";
        barang.stok = 30;
        barang.harga = 12000;

        System.out.println("Id barang: " + barang.id);
        System.out.println("Nama barang: " + barang.nama);
        System.out.println("Stok barang: " + barang.stok);
        System.out.println("Harga barang: " + barang.harga);
        System.out.printf("ketersediaan barang: %s\n"  , barang.isAvailable() ? "Tersedia": "Tidak tersedia");


        System.out.println("========================================");

        barang.stok = 0;

        System.out.println("Id barang: " + barang.id);
        System.out.println("Nama barang: " + barang.nama);
        System.out.println("Stok barang: " + barang.stok);
        System.out.println("Harga barang: " + barang.harga);
        System.out.printf("ketersediaan barang: %s\n"  , barang.isAvailable() ? "Tersedia": "Tidak tersedia");

    }
}
