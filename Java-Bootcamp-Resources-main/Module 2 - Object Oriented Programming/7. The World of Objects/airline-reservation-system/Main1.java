import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        String[] passport = new String[3];
        Person1 jack = new Person1("Munir", "USA", "01/11/1111", 4,passport );
        if (jack.applyPassport() == true) {
        jack.setPassport();
        }

        System.out.println("Name: " + jack.getName() + "\n" + "Nationality: " + jack.getNationality() +
                "\n" + "Date of Birth: " + jack.getDateOfBirth() + "\n" + "Seat number: " + jack.getSeatNumber() + "\n" + "Passport: " + Arrays.toString(passport));

        if (jack.applyPassport() == true) {
            System.out.println("Congratulations " + jack.getName() + ". Your passport was approved.");
        } else {
            System.out.println("We're sorry " + jack.getName() + ". We can not process your applicatioon");
        }
    }
}
