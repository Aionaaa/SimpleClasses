public class Bottle {
    private int volume;



    public Bottle(int volume){
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }

    public int drinkWater() {
        return this.volume - 10;
    }

    public int emptyBottle() {
        return this.volume - this.volume;
    }

    public int fillBottle() {
        return this.volume = 100;
    }
}
