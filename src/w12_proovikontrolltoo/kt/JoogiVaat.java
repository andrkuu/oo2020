package kt;

public class JoogiVaat {
    private float volume;
    private float quantity;

    public JoogiVaat(float volume, float quantity) {
        this.volume = volume;
        this.quantity = quantity;
    }

    public void printQuantity() {
        System.out.println("Vaadis on " + this.quantity + "/"+this.volume);
    }

    public float getQuantity() {
        return quantity;
    }

    public boolean FillBottle(Joogipudel bottle){
        System.out.println("Alustan " +bottle.GetVolume() +" liitrise pudeli täitmist");
        if(quantity > bottle.GetVolume()){
            bottle.SetQuantity(bottle.GetVolume());
            quantity -= bottle.GetVolume();
            System.out.println("Valasin pudeli täis ("+bottle.GetVolume()+"l)");
            printQuantity();
            return true;
        }
        else{
            System.out.println("Vaadis pole nii palju jooki");
            return false;
        }

    }

    public boolean Fill(float liters){
        if(this.volume - this.quantity >= liters){
            this.quantity += liters;
            System.out.println("Kallasite " + liters + " liitrit juurde");
            printQuantity();
            return true;
        }
        else{
            System.out.println("Pole nii palju ruumi et " + liters + " liitrit juurde valada");
            printQuantity();
            return false;
        }
    }

    @Override
    public String toString() {
        printQuantity();
        return "";
    }
}
