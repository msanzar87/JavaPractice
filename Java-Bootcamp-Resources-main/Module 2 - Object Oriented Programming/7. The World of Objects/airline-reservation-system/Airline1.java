

public class Airline1 {
private Person1[] seats;


public Airline1(){
    this.seats = new Person1[11];
}

public Person1 getSeats(int index){
    return new Person1(this.seats[index]);
}

    public void setSeats(Person1 seats, int index) {
    this.seats[index] = new Person1(seats);

    }
}
