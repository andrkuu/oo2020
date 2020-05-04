package PersonalCode;

public class EstonianCode extends PersonalCode implements PersonalCodeBehaviour {
    EstonianCode(String id_code) {
        super(id_code);
    }

    @Override
    public int getGender() {
        return super.getGender();
    }

    @Override
    public String getGenderWord() {
        if(getGender() == 3){
            return "Mees";
        }else{
            return "Naine";
        }
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public int getMonth() {
        return super.getMonth();
    }

    @Override
    public String toString() {
        return "Isik on " + getGenderWord() + " ja ta on sündinud 19" +getYear()+"."+ getMonth()+"."+ getDay();
    }
}
