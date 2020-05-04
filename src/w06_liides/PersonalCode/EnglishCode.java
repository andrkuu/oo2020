package PersonalCode;

public class EnglishCode extends PersonalCode implements PersonalCodeBehaviour {
    EnglishCode(String id_code) {
        super(id_code);
    }

    @Override
    public int getGender() {
        return super.getGender();
    }

    @Override
    public String getGenderWord() {
        if(getGender() == 3){
            return "Male";
        }else{
            return "Female";
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
        return "Person is a " + getGenderWord() + " and is born in 19" +getYear()+"."+ getMonth()+"."+ getDay();
    }
}
