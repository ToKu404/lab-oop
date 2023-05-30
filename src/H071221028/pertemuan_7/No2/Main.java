class Product <T>{
    private String name;
    private T price;
    private String expiryDate;
    
    public Product(String name, T price, String expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public T getPrice() {
        return price;
    }
    // public String toString(){
    //     return this.name + " - " + this.price + " - " + this.expiryDate;
    // }
    
}

class Uang{
    public Uang(int uang) {
        this.uang = uang;
    }
    public int getUang(){
        return uang;
    }

    private int uang;
}

public class Main {
    public static void main(String[] args) {
        Product<Integer> product1 = new Product<>("Kinder Joy", 1000, "2023-05-01");
        Product<String>  product2 = new Product<>("Sari Roti", "Rp.15.000", "2023-05-20");
        Product<Double>  product3 = new Product<>("Susu Kurma", 7.5, "2023-06-01");
        Product<Uang> product4  = new Product<>("Kit", new Uang(2000), "2023-05-10");
    
        System.out.println("Product 1: " + product1.getName()+ " - " + product1.getPrice() + " - " + product1.getExpiryDate());
        System.out.println("Product 2: " + product2.getName()+ " - " + product2.getPrice() + " - " + product2.getExpiryDate());
        System.out.println("Product 3: " + product3.getName()+ " - " + product3.getPrice() + " - " + product3.getExpiryDate());
        System.out.println("Product 4: " + product4.getName()+ " - " + product4.getPrice().getUang() + " - " + product4.getExpiryDate());
        // System.out.println("Product 2: " + product2);
        // System.out.println("Product 3: " + product3);
        
    }


    
}
