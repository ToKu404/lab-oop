package No3;

public class FoodFactory {
    static Food getFood(String food) { // bertipe data "Food" karena mengembalikan objek makanan yang sesuai jenisnya (sesuai perintah soal)
        Food makanan = null; // nilai default
        if (food.equals("burger")) {
            makanan = new Burger(); 
        } else if (food.equals("pizza")) {
            makanan = new Pizza(); 
        } else if (food.equals("steak")) {
            makanan = new Steak(); 
        }
        return makanan;
    }
}