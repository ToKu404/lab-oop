class ApexLegends {
  String character;
  int armor;
  Skill skill;
  String role;

  // public void karakter() {
  //   System.out.println("this character" + character);
  // }

  public Skill getSkill(){
    return skill;
  }

  public void setSkill(Skill skill){
    this.skill = skill;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role){
    this.role = role;
  }

  public int getArmor(){
    return armor;
  }

  public void setArmor(int armor){
    this.armor = armor;
  }

  public ApexLegends(String character, String role, int armor){
    this.character = character;
    this.role = role;
    this.armor = armor;
    System.out.println();
  }

  public ApexLegends( String character){
    this.character = character;
    System.out.println();
  }
}

class Skill {
  String powerone;
  String powertwo;

  public String getfullSkill(){
    return powerone + powertwo;
  }
}

public class No1{
  public static void main(String[] args) {
      Skill skill = new Skill();
      skill.powerone = "duarr ";
      skill.powertwo = "afh iyhh";

      ApexLegends apex = new ApexLegends("layla");
      apex.skill = skill;
      apex.armor = 2000;
      apex.role = "Rush";
      

      System.out.println("Nama karakter : " + apex.character);
      System.out.println("Jumlah armor: " + apex.armor);
      System.out.println("Roll : " + apex.getRole());
      System.out.println("Skill : " +apex.getSkill().getfullSkill());
  }   
}