package PersonalCode;

public class PersonalCode implements PersonalCodeBehaviour {

    private String id_code;

    PersonalCode(String id_code){
        this.id_code = id_code;
    }

    @Override
    public int getGender() {
        return Integer.parseInt(this.id_code.substring(0,1));
    }

    @Override
    public String getGenderWord() {
        return "";
    }

    @Override
    public int getYear() {
        String year = this.id_code.substring(1, 3);
        return Integer.parseInt(year);
    }

    @Override
    public int getMonth() {
        String year = this.id_code.substring(3, 5);
        return Integer.parseInt(year);
    }

    @Override
    public int getDay() {
        String day = this.id_code.substring(5,7);
        return Integer.parseInt(day);
    }


    @Override
    public String toString() {
        return "Isik on " + getGenderWord() + " ja ta on sündinud 19" +getYear()+"."+ getMonth()+"."+ getDay();

    }
}
