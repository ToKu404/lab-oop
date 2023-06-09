package No3;
import java.util.List;

public class Restaurant {
    static int calculateTotal(List<Food> listMakanan) {
        int totalPrice = 0;
        for (Food i : listMakanan) { // perulangan untuk mengeluarkan objek-objeknya, i itu adalah objek-objek nya (burger,dll)
            totalPrice += i.getPrice();
        }
        return totalPrice;
    }
}
