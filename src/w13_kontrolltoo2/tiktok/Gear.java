package tiktok;

import java.util.ArrayList;
import java.util.List;

public class Gear implements GearBehaviour{

    private int cogCount;
    private int lap;
    private int ticks;
    private String gearName;
    public List<Gear> connectedGears = new ArrayList<>();
    public List<Hand> connectedHands = new ArrayList<>();

    public Gear(int cogCount, String gearName){ // cogCount võiks olla hammasratta "hammaste" arv
        this.cogCount = cogCount;
        this.gearName = gearName;
        this.ticks = 1;
        this.lap = 0;
    }

    public void PrintTicks(){
        System.out.println(" ");
        System.out.print(gearName + "("+lap+"):");
        for (int i = 0; i < ticks; i++) {
            System.out.print("|");
        }
        System.out.println("");
    }

    public void JoinHand(Hand h){

        if(!connectedHands.contains(h)){
            connectedHands.add(h);
            System.out.println("Ühendasin ratta " + this.gearName +" osutiga "+h.handName);
        }
        else{
            System.out.println("Need rattad on juba ühendatud");
        }
    }

    public void JoinGear(Gear g){

        if(g != this){
            if(g.connectedGears.contains(this)){
                System.out.println("Need rattad on juba ühendatud");
            }
            else{
                if(!connectedGears.contains(g)){
                    connectedGears.add(g);
                    System.out.println("Ühendasin ratta " + this.gearName +" rattaga "+g.gearName);
                }
                else{
                    System.out.println("Need rattad on juba ühendatud");
                }
            }
        }else{
            System.out.println("Iseenda külge ei saa ennast ühendada");
        }

    }

    public void Tick(){
        PrintTicks();

        if(!connectedGears.isEmpty()){
            connectedGears.stream().forEach(Gear::Tick); // pööra iga selle ratta külge ühendatud ratast edasi
        }

        if(ticks < cogCount){
            ticks++;
        }else{
            if(!connectedHands.isEmpty()){
                connectedHands.stream().forEach(Hand::Move); // pööra iga selle ratta külge ühendatud osutit edasi
            }
            ticks = 1;
            lap++;
            System.out.println("("+this.gearName+") Lap:" + lap);
        }

    }

}
