public class WaterBottle {

    private int volume;

//    CONSTRUCTOR

    public WaterBottle(){
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }

   public int drink(){
        return this.volume -= 10;
   }

   public int empty(){
        return this.volume -= this.volume;
   }

   public int fill(){
        int refill = 100 - this.volume;
        return this.volume += refill;
   }

}



