public class Product<T> {
    private T price;
    private String name, expiryDate;

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Product(T price, String name, String expiryDate){
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }
}