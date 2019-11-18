public class Printer {
    private int paper;
    private int toner;


    public Printer(int paper, int toner){
        this.paper = 10;
        this.toner = 10;
    }

    public int hasPaper() {
        return this.paper;
    }

    public boolean print(int pages, int copies){
        if (this.paper >= (pages * copies)) {
            this.toner -= 1;
            return true;

        }
        return false;
    }
}
