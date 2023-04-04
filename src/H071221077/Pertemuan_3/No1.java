import java.util.ArrayList;
import java.util.List;
class Food{

    //atribut
    String namaMakanan;
    String jenisMakanan;
    int harga;
    List<Ingredient> ingredients;

    //behaviour
    public void showIngredients(){
        System.out.println("Ingredients dari " + namaMakanan + ":");
        for (Ingredient ingredient : ingredients){
            System.out.println(ingredient.getTheIngredient());}
    }

    public void terapkanDiscount(int persentaseDiscount){
        harga = harga - (persentaseDiscount * harga / 100);
    }

    public int getHarga(){
        return harga;
    }

    public void setHarga (int harga){
        this.harga = harga;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredients(Ingredient ingredient){
        this.ingredients.add(ingredient);
    }

    //constructor
    public Food(String namaMakanan, String jenisMakanan, int harga) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.jenisMakanan = jenisMakanan;
        this.ingredients = new ArrayList<>();
    }
    
    public Food(String namaMakanan, List<Ingredient> ingredients) {
        this.namaMakanan = namaMakanan;
        // this.harga = harga;
        this.ingredients = ingredients;
    }

    public Food (){
    
    }
}

    class Ingredient {
        String name;
        int quantity;
    
        public String getTheIngredient(){
            return "Membutuhkan " + name + " sebanyak " + quantity + "kg";
        }
        
        public Ingredient(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }
    
        public String getName() {
            return name;
        }
    
        public int getQuantity() {
            return quantity;
        }
    
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }

public class No1 {
    public static void main(String[] args) {
        Ingredient ingredient1 = new Ingredient("Nasi", 10);
        Ingredient ingredient2 = new Ingredient("Sosis", 2);

        Food food = new Food("Nasi Goreng", "Makanan berat", 25000);
        food.addIngredients(ingredient1);
        food.addIngredients(ingredient2);
        
        System.out.println("Nama makanan\t\t:" + food.namaMakanan);
        System.out.println("Jenis makanan\t\t:" + food.jenisMakanan);
        System.out.println("Harga\t\t\t:" + food.getHarga());
        food.terapkanDiscount(20);
        System.out.println("Harga setelah diskon\t:" + food.getHarga());
        food.showIngredients();

        // List<Ingredient> ingredients = new ArrayList<>();
        // Food food2 = new Food("Mie goreng", ingredients);
        // Food food3 = new Food();
    }
}