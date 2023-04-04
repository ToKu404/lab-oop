class Person {
    String name; //atribut 2-4
    int age;
    boolean isMale; 

    public void setName (String name){ //String name itu parameter
        this.name = name; // this supaya merujuk ke objek atau class dan nama antara atribut dan parameter harus sama, bisa tidak pakai this tp harus beda nama antara atribut dan parameter
    }
    public String getName () {
        return name;
    }
    public void setAge (int age) { //public void yaitu method yang tidak mengembalikan apa2
        this.age = age; 
    }
    public int getAge () {
        return age;
    }
    public void setGender (String gender) { //String gender karena 
        this.isMale = gender == "male";
    }
    public String getGender (){
        if (isMale) {
            return "male";
        }
        else {
            return "female";
        }

    }
}

public class No2{
    public static void main(String[] args) {
        Person orang = new Person ();
        orang.setName("Fara");
        orang.setAge(18);
        orang.setGender("female");

        System.out.println("Nama: " + orang.getName());
        System.out.println("Umur: " + orang.getAge());
        System.out.println("Jenis kelamin: " + orang.getGender());
    }
}
