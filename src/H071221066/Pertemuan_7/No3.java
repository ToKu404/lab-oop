import java.util.ArrayList;
import java.util.List;

abstract class Food {
    protected int price;

    public Food (int price) {
        this.price = price;
    }
    int getPrice(){
        return price;
    }
}

class Burger extends Food {
    public Burger(int price) {
        super(price);
    }
}

class Pizza extends Food {
    public Pizza (int price) {
        super(price);
    }
}

class Steak extends Food {
    public Steak (int price) {
        super(price);
    }
}

class FoodFactory {
    public static Food getFood(FoodType foodType) {
        if (foodType==FoodType.burger){
            return new Burger(15000);
        }

        else if (foodType == FoodType.pizza) {
            return new Pizza(85000);
        }

        else if (foodType == FoodType.steak) {
            return new Steak(55000);
        }
        
        else {
            throw new IllegalArgumentException("Invalid food type: " + foodType);
        }
                
        }
    }


class Restaurant {
    static int calculateTotal(List<Food> foods) {
        int total = 0;
        
        for (Food food : foods) {
            total += food.getPrice();
        }
        return total;
    }
}

public class No3 {
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood(FoodType.burger);
        Food pizza = FoodFactory.getFood(FoodType.pizza);
        Food steak = FoodFactory.getFood(FoodType.steak);

        List<Food> foods = new ArrayList<Food>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);
        System.out.println("Total harga : " + total);
    }
}

enum FoodType {
    burger, pizza, steak
}