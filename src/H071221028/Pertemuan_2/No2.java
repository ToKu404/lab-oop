public class No2 {


    public static void main(String[] args) {
        Person person = new Person();
        person.setName("awa");
        person.setAge(18);
        person.setGender("Male");

        System.out.println("nama: " + person.getName());
        System.out.println("umur: " + person.getAge());
        System.out.println("Jenis kelamin: " + person.getGender());


    }
}

class Person {
    String name;
    int age;
    boolean isMale;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.isMale = gender == "Male";
    }

    public String getGender(){
        if (isMale) {
            return "Male";
         }
        else {
            return "Female";
        }

}
}