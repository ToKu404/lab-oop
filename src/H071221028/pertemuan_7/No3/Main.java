import java.util.ArrayList;
import java.util.List;


interface Food {
    public int getPrice();
}

class Burger implements Food{

    @Override
    public int getPrice() {
        return 8;
    }
}

class Pizza implements Food{

    @Override
    public int getPrice() {
        return 7;
    }
}

class Steak implements Food{

    @Override
    public int getPrice() {
        return 20;
    }
}
class FoodFactory {
    static Food getFood(FoodType food) throws Exception { // bertipe data "Food" karena mengembalikan objek makanan yang sesuai jenisnya (sesuai perintah soal)
        if (food == FoodType.burger) {
        return new Burger(); 
        } else if (food == FoodType.pizza) {
            return new Pizza(); 
        } else if (food== FoodType.steak) {
            return new Steak(); 
        }else{
            System.out.println("error");
            throw new Exception();
        }
    }
}


class Restaurant {
    static int calculateTotal(List<Food> foods) {
        int totalPrice = 0;
        for (Food i : foods) { // perulangan untuk mengeluarkan objek-objeknya, i itu adalah objek-objek nya (burger,dll)
            totalPrice += i.getPrice();
        }
        return totalPrice;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Food burger = FoodFactory.getFood(FoodType.burger);
        Food pizza = FoodFactory.getFood(FoodType.pizza);
        Food steak = FoodFactory.getFood(FoodType.steak);

    
        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);
    
        int total = Restaurant.calculateTotal(foods);
    
        System.out.println("Total price: " + total);
      }
}

enum FoodType{
    burger, pizza, steak
}