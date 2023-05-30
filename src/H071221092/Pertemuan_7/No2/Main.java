package No2;

public class Main {
    public static void main(String[] args) {
        Product<String> product1 = new Product<>("Pizza", "Rp 1000", "12-12-2022");
        Product<Integer> product2 = new Product<>("Burger", 2000, "12-01-2020");
        Product<Double> product3 = new Product<>("Ciki", 12.12, "13-03-2020");

        System.out.println("===== Produk 1 =====");
        System.out.println("Nama: " + product1.getName());
        System.out.println("Harga: " + product1.getPrice());
        System.out.println("Tanggal Kadaluarsa: " + product1.getExpDate());
        System.out.println();

        System.out.println("===== Produk 2 =====");
        System.out.println("Nama: " + product2.getName());
        System.out.println("Harga: " + product2.getPrice());
        System.out.println("Tanggal Kadaluarsa: " + product2.getExpDate());
        System.out.println();

        System.out.println("===== Produk 3 =====");
        System.out.println("Nama: " + product3.getName());
        System.out.println("Harga: " + product3.getPrice());
        System.out.println("Tanggal Kadaluarsa: " + product3.getExpDate());
        System.out.println();
    }
}

class Product <A> { // generic bisa lebih dari 1 variabel
    protected String name;
    protected A price;
    protected String expDate;

    public Product (String name, A price, String expDate){
        this.name = name;
        this.price = price;
        this.expDate = expDate;
    }
    public String getName(){
        return name;
    }
    public A getPrice(){
        return price;
    }
    public String getExpDate(){
        return expDate;
    }
}