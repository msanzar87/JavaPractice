import java.util.Arrays;

public class Person1 {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private int seatNumber;
    private String[] passport;

    public Person1(String name, String nationality, String dateOfBirth, int seatNumber, String[] passport) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }
    public Person1(Person1 source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
        this.passport = Arrays.copyOf(source.passport,source.passport.length);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String[] getPassport() {
        return Arrays.copyOf(this.passport,passport.length);
    }

    public void setPassport() {
        this.passport = new String[] {this.name, this.nationality, this.dateOfBirth};
    }

    public boolean applyPassport() {
        int number = (int) (Math.random() * 2);  //random int that can be 0 or 1.
        if (number == 0) {
            return false;
        } else {
            return true;
        }
    }
    public void chooseSeat(){
        this.seatNumber = (int) (Math.random()*11 + 1);
    }

    public String toString(){
        return "Name: "+this.name + ". \n"
               + "Nationality: "+this.nationality + ". \n"
                +"DOB: "+this.dateOfBirth + ". \n"
                +"Seat Number: "+this.seatNumber + ". \n"
                +"Passport: "+Arrays.toString(this.passport) + ". \n";

    }
}



