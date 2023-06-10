class Product <T> {
    protected String nama;
    protected T harga;
    protected String expire;
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public T getHarga() {
        return harga;
    }
    public void setHarga(T harga) {
        this.harga = harga;
    }
    public String getExpire() {
        return expire;
    }
    public void setExpire(String expire) {
        this.expire = expire;
    }
    public Product(String nama, T harga, String expire) {
        this.nama = nama;
        this.harga = harga;
        this.expire = expire;
    }
}

public class No2 {
    public static void main(String[] args) {
        Product<Integer> product = new Product<>("Kinderjoy", 10000, "2023-05-01");
        Product<String> productLagi = new Product<>("Sari Roti", "Rp 15.00", "2023-05-20");
        Product<Double> productLagiLagi = new Product<>("Susu Kurma", 7.5, "2023-06-01");

        System.out.println(product.getNama() + " - " + product.getHarga() + " - " + product.getExpire());
        System.out.println(productLagi.getNama() + " - " + productLagi.getHarga() + " - " + productLagi.getExpire());
        System.out.println(productLagiLagi.getNama() + " - " + productLagiLagi.getHarga() + " - " + productLagiLagi.getExpire());
    }
}
