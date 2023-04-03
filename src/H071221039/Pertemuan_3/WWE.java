package H071221039.Pertemuan_3;
public class WWE{
    private Person person;
    private String ultimate;
    private double power, healthPoints;
    
    public WWE (){}

    public WWE(Person person, String ultimate, double power, double healthPoints){
        this.person = person;
        this.power = power;
        this.ultimate = ultimate;
        this.healthPoints = healthPoints;
    }

    public void setPower(double power){
        this.power = power;
    }
    public void setUltimate(String ultimate){
        this.ultimate = ultimate;
    }
    public void setHealthPoints(double healthPoints){
        this.healthPoints = healthPoints;
    }

    public double getPower(){
        return power;
    }
    public String getUltimate(){
        return ultimate;
    }
    public double getHealthPoints(){
        return healthPoints;
    }

    public void identitasPegulat(){
        System.out.println("Name = " + person.getName());
        System.out.println("Power = " + power);
        System.out.println("Ultimate = " + ultimate);
        System.out.println("Health Points = " + healthPoints);
    }
    
    public void smack(WWE lawan){ 
        lawan.setHealthPoints(lawan.getHealthPoints()-this.getPower());
        System.out.printf("Nyawa %s setelah di %s oleh %s adalah %.2f",lawan.person.getName(),this.ultimate,this.person.getName(),lawan.getHealthPoints());
    }
}
class Person{
    private String name;
    private String gender;
    
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
    return gender;
    }

    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
}