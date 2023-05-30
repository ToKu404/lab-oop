public class BangunRuang{
   protected double volume;
   protected double luaspermukaan;
   protected double nilai1, nilai2, nilai3, nilai4;

   public BangunRuang(){}
   public BangunRuang(double nilai1){
      this.nilai1 = nilai1;
   }
   public BangunRuang(double nilai1, double nilai2){
      this.nilai1 = nilai1;
      this.nilai2 = nilai2;
   }
   public BangunRuang(double nilai1, double nilai2, double nilai3){
      this.nilai1 = nilai1;
      this.nilai2 = nilai2;
      this.nilai3 = nilai3;
   }
   public double getVolume (){
      return volume;
   }
   public double getLuasPermukaan (){
      return luaspermukaan;
   }
}