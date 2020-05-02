package roulette;

import java.util.Random;

public class Round implements Objects{
    private int userNumber;
    private double betSize;
    private int genNumber;
    private double winSize;

    public Round(int userNumber, double betSize){
        this.userNumber = userNumber;
        this.betSize = betSize;
        RandomTile();
        System.out.println(RoundResult());
    }

    @Override
    public int RandomTile() {
        Random r = new Random();
        int min = 0;
        int max = 100;

        genNumber = r.nextInt((max - min) + 1) + min;
        return genNumber;
    }

    @Override
    public String RoundResult() {

        // Täpne
        //
        winSize = betSize;

        if(userNumber != 0 && genNumber!= 0){
            if(genNumber <= 50 && userNumber <= 50){
                winSize *= 2;
                return "Your bet size has doubled!! .Your number: " + userNumber + ", generated number: "+ genNumber+" You recived: "+ winSize + " krooni";
            }
            else if(genNumber > 50 && userNumber > 50){
                winSize *= 2;
                return "Your bet size has doubled!! Your number: " + userNumber + ", generated number: "+ genNumber+" You recived: "+ winSize + " krooni";
            }
            else{
                winSize = -betSize;
                return "LOST. Your number: " + userNumber + ", generated number: "+ genNumber+" You lost: "+ winSize + " krooni";
            }
        }
        else if(userNumber == genNumber){
            winSize *= 4;
            return "Your bet size has increaed 4x!! Your number: " + userNumber + ", generated number: "+ genNumber+" You recived: "+ winSize + " krooni";
        }
        else {
            winSize = -betSize;
            return "LOST. Your number: " + userNumber + ", generated number: "+ genNumber+" You lost: "+ winSize + " krooni";
        }

    }

    @Override
    public double GetBalance() {
        return winSize;
    }
}
