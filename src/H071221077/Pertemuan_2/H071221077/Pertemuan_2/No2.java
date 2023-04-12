package H071221077.Pertemuan_2;

class Person {
    String name;
    int age;
    boolean isMale;

    public void setName(String name){
        this.name = name;               //this=variabel yg dmksd yg di class
    }

    public String getName(){
        return name;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        System.out.println(gender == "Male");
        this.isMale = gender == "Male";
    }

    public String getGender(){
        if (isMale){        //==true/false
            return "Male";
        }
        else{
            return "Female";
        }
    }
    // public void setGender(String gender) {
    //     if (gender.equalsIgnoreCase("male")) {
    //       this.isMale = true;
    //     } else {
    //       this.isMale = false;
    //     }
    //   }
      
    // public boolean getGender() {
    //     return isMale;
    //   }
}

public class No2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Cheryl");
        person.setAge(19);
        person.setGender("Male");

        System.out.println("Nama: "+ person.getName());
        System.out.println("Umur: "+ person.getAge());
        System.out.println("Jenis kelamin: "+ person.getGender());
    }
}