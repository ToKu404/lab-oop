package H071221066.Pertemuan_2;
//NO 3

class Product {
    private int id;
    private String nama;
    private int stok;
    private double harga;

    public Product(int id, String nama, int stok, double harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public double getHarga() {
        return harga;
    }

    public boolean isAvaliable() {
        return stok > 0;
    }

}

public class No3 {
    public static void main(String[] args) {
        Product produk1 = new Product(111, "Sabun", 50, 4000);
        Product produk2 = new Product(222, "Shampoo", 0, 10000);

        System.out.println("ID produk 1: " + produk1.getId());
        System.out.println("Nama produk 1: " + produk1.getNama());
        System.out.println("Stok produk 1: " + produk1.getStok());
        System.out.println("Harga produk 1: " + produk1.getHarga());
        System.out.println("Apakah produk 1 tersedia di stok? " + produk1.isAvaliable());


        System.out.println("========================================");

        System.out.println("ID produk 2: " + produk2.getId());
        System.out.println("Nama produk 2: " + produk2.getNama());
        System.out.println("Stok produk 2: " + produk2.getStok());
        System.out.println("Harga produk 2: " + produk2.getHarga());
        System.out.println("Apakah produk 2 tersedia di stok? " + produk2.isAvaliable());
    }
}
