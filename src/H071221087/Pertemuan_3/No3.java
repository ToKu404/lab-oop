package H071221087.Pertemuan_3;
import java.util.ArrayList;
import java.util.Scanner;

class User {
    private String nama;
    private int balance;

    public User(String nama, int balance){
        this.nama = nama;
        this.balance = balance;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public int getBalance() {
        return balance;
    }
    public void reduceBalance(int balance) {
        this.balance = this.balance - balance;
    }
    public void userCard(){
        System.out.println("-----CARD-----");
        System.out.println(this.getNama());
        System.out.println(this.getBalance());
        System.out.println("--------------");
    } 
}

class Product {
    private String nama;
    private int price;
    private int stock;

    public Product(String nama, int price, int stock) {
        this.nama = nama;
        this.price = price;
        this.stock = stock;
    }
    public Product(String nama, String price, int stock) {
        this.nama = nama;
        this.stock = stock;
        
        if (price.contains("K")) {
            price = price.replace("K", "");
            this.price = Integer.parseInt(price) * 1000;
        } else {
            this.price = Integer.parseInt(price);
        }
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public int getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public void sell() {
        stock--;
    }
}

class Store {
    public String nama;
    public ArrayList<Product> products;

    public Store(String nama, ArrayList<Product> product){
        this.nama = nama;
        this.products = product;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void listProducts() {
        System.out.printf("\nSelamat Datang di %s%n", this.nama);
        System.out.println("----------------------------");
        System.out.println("Daftar Buku :");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println((i + 1) + ". " + product.getNama() + " - Rp." + product.getPrice() + " | Stok " + product.getStock());
        }
    }
    public void buyProduct(User user, int productIndex) {
        Product product = products.get(productIndex);
        if (user.getBalance() >= product.getPrice()) {
            user.reduceBalance(product.getPrice());
            product.sell();

            if (product.getStock() == 0) {
                products.remove(productIndex);
            }
            System.out.println(user.getNama() + " Berhasil Membeli " + product.getNama());
        } else {
            System.out.println("----SALDO ANDA TIDAK MENCUKUPI----");
        }
    }
}

public class No3 {
    public static void main(String[] args) {
        User user = new User("Muhammad iqbal", 1000000);
        ArrayList<Product> product = new ArrayList<>();
        product.add(new Product("Diary Introvert", "100K", 10));
        product.add(new Product("Filosofi Teras", "100K", 14));
        product.add(new Product("Atomic Habits", "100K", 6));
        product.add(new Product("The Midnight Library", "100K", 8));

        Store toko = new Store("BookStore", product);
        Scanner input = new Scanner(System.in);

        while (true) {
            user.userCard();
            toko.listProducts();
            System.out.println("0. Keluar");
            System.out.print("> ");
            int pilihan = input.nextInt();
            
            if (pilihan >= 1 && pilihan <= toko.products.size()) {
                while (true) {
                    System.out.println("\nApakah anda yakin ingin membeli Buku ini?");
                    System.out.println("1. YA\n2. TIDAK");
                    System.out.print("> ");
                    int konfirmasi = input.nextInt();
                    if (konfirmasi == 1 ){
                            toko.buyProduct(user, pilihan-1);
                            break;
                    } else {
                        break;
                    } 
                } 
            } else {
                System.out.println("TERIMA KASIH! Selamat Datang Kembali :)");
                break;
            }

        }
            input.close();
    }
}    