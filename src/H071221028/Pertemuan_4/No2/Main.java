package H071221028.Pertemuan_4.No2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Lexus SUV");
        car1.setModel("UX 300 e");
        car1.setYear(2020);
        car1.setPrice(1495000000);
        car1.setIsPaid(false);
        car1.displayInfo();

        Car car2 = new Car("Audi", "A5", 2023,821752120, true);
        System.out.println("Info car 2 :");
        System.out.println("Brand: " + car2.getBrand());
        System.out.println("Model: " + car2.getModel());
        System.out.println("Year: " + car2.getYear());
        System.out.println("Price: " + car2.getPrice());
        System.out.println("Is Sold: " + car2.getIsPaid());

        SelfUtils.displaySelfData();
    }
}
