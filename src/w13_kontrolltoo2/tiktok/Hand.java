package tiktok;

public class Hand {

    private int position;
    private int step;
    private int elapsedTicks;
    public String handName;

    Hand(int step, String handName){
        this.position = 0;
        this.step = step;
        this.handName = handName;
    }


    public void Move(){
       elapsedTicks++;
       if(elapsedTicks % step == 0){
            position += 1;
            System.out.println("("+this.handName+")"+this.getClass().getName().replace("tiktok.","") + " pos: " + position);
        }
    }

}
