public class Main1 {
    public static void main(String[] args) {
        Person1 jack = new Person1("Munir","USA","01/11/1111",4);

        jack.setSeatNumber(10);
        System.out.println("Name: "+jack.getName()+ "\n" + "Nationality: "+jack.getNationality()+
                "\n" + "Date of Birth: "+jack.getDateOfBirth()+ "\n" + "Seat number: "+jack.getSeatNumber());

    }
}
