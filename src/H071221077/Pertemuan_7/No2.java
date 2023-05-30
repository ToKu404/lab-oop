class Product<P>{
    protected String name;
    protected P price;
    protected String expDate;

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public P getPrice() {
        return price;
    }

    public String getExpDate() {
        return expDate;
    }

    public Product(String name, P price, String expDate) {
        this.name = name;
        this.price = price;
        this.expDate = expDate;
    }
}

// class Koin{
//     private int koin;

//     public int getKoin() {
//         return koin;
//     }

//     public Koin(int koin) {
//         this.koin = koin;
//     }
// }

public class No2{
    public static void main(String[] args) {
        Product<Integer> product = new Product<>("Kinderjoy", 10000, "2023-05-01");
        Product<String> product2 = new Product<>("Sari Roti", "Rp. 15.000", "2023-05-20");
        Product<Double> product3 = new Product<>("Susu Kurma", 7.5, "2023-06-01");
        //Product<Koin> product4 = new Product<>("Uang", new Koin(10), "2023-06-01");
        
        System.out.println("Product 1: " + product.getName() + " - " + product.getPrice() + " - " + product.getExpDate());
        System.out.println("Product 2: " + product2.getName() + " - " + product2.getPrice() + " - "  + product2.getExpDate());
        System.out.println("Product 3: " + product3.getName() + " - " + product3.getPrice() + " - " + product3.getExpDate());
        //System.out.println("Product 4: " + product4.getName() + " - " + product4.getPrice().getKoin() + " - " + product4.getExpDate());
        
    }
}
