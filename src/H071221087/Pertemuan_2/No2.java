package H071221087.Pertemuan_2;
class Person{
    String name;
    int age;
    boolean isMale;

    void setName(String nama){
        this.name = nama;
    }
    void setAge(int age){
        this.age = age;
    }
    void setGender(String gender){
        if(gender.equalsIgnoreCase("Pria")){
            isMale = true;
        }else{
            isMale = false;
        }
    }

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getGender(){
        if(isMale == true) {
            return "Pria";
        } else {
            return "Wanita";
        }
    }
}

public class No2 {
    public static void main(String[] args) {
        Person objekdata = new Person();
        objekdata.setName("Muhammad iqbal");
        objekdata.setAge(19);
        objekdata.setGender("Pria");
        System.out.println("Nama : "+objekdata.getName());
        System.out.println("Age : "+objekdata.getAge());
        System.out.println("isMale : "+objekdata.getGender());
    }
}