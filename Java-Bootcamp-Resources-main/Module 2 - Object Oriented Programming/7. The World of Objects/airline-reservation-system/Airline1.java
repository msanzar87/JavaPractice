

public class Airline1 {
private Person1[] seats;


public Airline1(){
    this.seats = new Person1[11];
}

public Person1 getPerson1(int index){
    return new Person1(this.seats[index]);
}

    public void setPerson1(Person1 person1) {
    this.seats[person1.getSeatNumber()-1] = new Person1(person1);

    }
}
