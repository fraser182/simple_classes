public class WaterBottle {

    private int volume; // private to the class

//    CONSTRUCTOR

    public WaterBottle(){
        this.volume = 100;
    }

    public int getVolume(){
        return volume;
    }


   public void drink(){
        volume -= 10;
   }

   public void empty(){
        volume = 0;
   }

   public void refill(){
        volume = 100;
   }

}


