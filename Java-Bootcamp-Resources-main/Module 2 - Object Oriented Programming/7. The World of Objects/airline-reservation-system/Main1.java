public class Main1 {
    public static void main(String[] args) {
        Person1 jack = new Person1("Munir","USA","01/11/1111",4);
        Person1 person2 = new Person1("Buzz","USA","2/22/2222", 22);
        person2.setSeatNumber(1);
        person2.setName("John");
        jack.setSeatNumber(10);
        System.out.println("Name: "+jack.getName()+ "\n" + "Nationality: "+jack.getNationality()+
                "\n" + "Date of Birth: "+jack.getDateOfBirth()+ "\n" + "Seat number: "+jack.getSeatNumber());
        System.out.println("Name: "+person2.getName()+ "\n" + "Nationality: "+person2.getNationality()+
                "\n" + "Date of Birth: "+person2.getDateOfBirth()+ "\n" + "Seat number: "+person2.getSeatNumber());
    }
}
