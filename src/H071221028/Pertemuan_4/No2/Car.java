class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean isPaid;

    public Car(String brand, String model, int year, double price, boolean isPaid) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isPaid = isPaid;
    }

    public Car(){}

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean getIsPaid() {
        return isPaid;
    }
    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
    
    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("Is Paid? "+( isPaid? "yes": "no"));
    }

    
    
}

