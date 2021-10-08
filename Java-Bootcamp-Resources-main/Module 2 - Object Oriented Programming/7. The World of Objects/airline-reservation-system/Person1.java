public class Person1 {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private int seatNumber;
    private String[] passport;

    public static boolean applyPassport(){
        int number = (int) (Math.random()*2);
        if (number == 0){
            return false;
        }
        return true;
    }
    public void chooseSeat(){
        this.seatNumber = (int) (Math.random()*11 + 1);
    }


    public Person1(){}
    public Person1(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber;
    }
    public Person1(Person1 source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}



