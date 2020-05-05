package tiktok;

import java.util.ArrayList;
import java.util.List;

public class Clock {

    long period;
    boolean label = true;
    int elapsedTicks;
    public List<Gear> gearList = new ArrayList<>();
    public List<Hand> handList = new ArrayList<>();

    public Clock(float length){
        CalculatePeriod(length);
    }

    private void CalculatePeriod(double length){
        double temp = (long)2* Math.PI * Math.sqrt(length/9.8);
        period = new Double(temp).longValue();
    }

    private String GetLabel(){
        label = !label;
        if (label){
            return "TOK";
        }else{
            return "TIK";
        }

    }

    public void JoinGear(Gear g){
        gearList.add(g);
    }

    public void AddHand(Hand h){
        handList.add(h);
    }

    public void Start() {
            while(true)

                try {
                    Thread.sleep(this.period);
                    elapsedTicks++;
                    System.out.println(GetLabel() + "(" +elapsedTicks +")");
                    gearList.forEach(Gear::Tick);
                    handList.forEach(Hand::Move);
                    System.out.println("___");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        };
}


