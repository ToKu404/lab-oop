package H071221039.Pertemuan_7;
public class FoodFactory {
    public static Food getFood(FoodType type) {
        if (type == FoodType.BURGER) {
            return new Burger();
        } else if (type == FoodType.PIZZA) {
            return new Pizza();
        } else if (type == FoodType.STEAK) {
            return new Steak();
        } else {
            throw new IllegalArgumentException("Invalid food type: " + type);
        }   
    }
}
