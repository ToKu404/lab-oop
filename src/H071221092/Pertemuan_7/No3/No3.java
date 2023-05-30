import java.util.ArrayList;
import java.util.List;

public class No3{
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood(FoodType.burger);
        Food pizza = FoodFactory.getFood(FoodType.pizza);
        Food steak = FoodFactory.getFood(FoodType.steak);

        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restaurant.kalkulTotal(foods);
        System.out.println("Total price: "+ total);
    }
}

class FoodFactory{ //poli itu klaas anak bs dsmpn diparent
    static Food getFood(FoodType food){ 
        if (food == FoodType.burger){ 
            return new Burger();
        }else if (food == FoodType.pizza){
            return new Pizza();
        }else if (food == FoodType.steak){
            return new Steak();
        }else{
            System.out.println("Error");
            return null;
        }
    }
}

interface Food{
    public int getPrice();
}

class Burger implements Food{

    @Override
    public int getPrice() {
        return 50000;
    }
}
class Pizza implements Food{

    @Override
    public int getPrice() {
        return 100000;
    }
}
class Steak implements Food{

    @Override
    public int getPrice() {
        return 70000;
    }
}

class Restaurant{
    static int kalkulTotal(List<Food> foods){
        int totalPrice = 0;
        for (Food food : foods){
            totalPrice += food.getPrice();
        }
        return totalPrice;
    }   
}
 
enum FoodType{ //kategori
    burger, pizza, steak
}