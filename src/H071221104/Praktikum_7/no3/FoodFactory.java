public class FoodFactory{
    public static Food getFood(String type){
        switch (type) {
            case "burger":
                return new Burger();
            case "pizza":
                return new Pizza();
            case "steak":
                return new Steak();
            default:
                return null;
        }
    }
}