package lab04;
public class Car extends Vehicle{
   private String typeEngine;
   
   public void setTypeEngine(String t){
       typeEngine = t;
   }
   public String getTypeEngine(){
       return typeEngine;
   }
   public void showCarInfo(){
       System.out.println("Car engine is "+typeEngine+".");
       System.out.println("Fuel is "+this.getFuel()+" litre and Top Speed is "+this.getTopSpeed()+" m/s.");
   }
   public void setCarInfo(int s, String t, String y){
       this.setFuel(s);
       this.setTopSpeed(t);
       this.setTypeEngine(y);
   }
   public void move(){
       if (this.getFuel() >= 50){
           System.out.println("Move.");
           this.setFuel(-50);
       } else{
           System.out.println("Please add fuel.");
       }
   }
}
