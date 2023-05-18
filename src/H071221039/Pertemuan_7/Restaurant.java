package H071221039.Pertemuan_7;
import java.util.List;

public class Restaurant {
    public static int calculateTotal(List<Food> foods) {
        int total = 0;
        for (Food food : foods) {
            total += food.getprice();
        }
        return total;
    }
}
