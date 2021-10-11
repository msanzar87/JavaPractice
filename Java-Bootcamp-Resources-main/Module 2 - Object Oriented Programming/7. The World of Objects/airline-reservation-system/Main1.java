public class Main1 {
    public static void main(String[] args) {
        String[] passport = new String[3];
        Person1[] seats = new Person1[]{
                new Person1("Munir", "USA", "01/11/1111", 4,passport ),
                new Person1("Buzz","UK","2/22/22",2,passport),
                new Person1("Christian","Canada","3/3/33",7,passport),

        };
        Airline1 airline1 = new Airline1();
        for (int i = 0; i < seats.length; i++) {
            airline1.setSeats(seats[i],i);
        }
        Person1 newSeat = airline1.getSeats(0);
        newSeat.setNationality("Russia");
        System.out.println(newSeat);
    }
}
