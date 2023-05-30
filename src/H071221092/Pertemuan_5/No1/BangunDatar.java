public class BangunDatar {
   protected double luas;
   protected double keliling;
   protected double nilai1, nilai2, nilai3;

   public BangunDatar(){}
   public BangunDatar(double nilai1){
      this.nilai1 = nilai1;
   }
   public BangunDatar(double nilai1, double nilai2){
      this.nilai1 = nilai1;
      this.nilai2 = nilai2;
   }
   public BangunDatar(double nilai1, double nilai2, double nilai3){
      this.nilai1 = nilai1;
      this.nilai2 = nilai2;
      this.nilai3 = nilai3;
   }
   public double getLuas (){
      return luas;
   }
   public double getKeliling (){
      return keliling;
   }
}
