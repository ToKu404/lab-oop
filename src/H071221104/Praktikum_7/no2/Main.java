public class Main{
    public static void main(String[] args) {
        Product<Integer> productInteger = new Product<>(10000, "Kinder Joy", "2020-05-01");
        Product<String> productString = new Product<>("Rp 15.000", "Sari Roti", "2023-05-20");
        Product<Double> productDouble = new Product<>(7.5, "Susu Kurma", "2023-06-01");
        System.out.println("Product 1: " +productInteger.getName() + " - "+ productInteger.getPrice() + " - " + productInteger.getExpiryDate());
        System.out.println("Product 2: " +productString.getName() + " - "+ productString.getPrice() + " - " + productString.getExpiryDate());
        System.out.println("Product 3: " +productDouble.getName() + " - "+ productDouble.getPrice() + " - " + productDouble.getExpiryDate());
    }
}
