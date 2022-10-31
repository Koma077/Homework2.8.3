import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Passport {
    private final int passportNumber;
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String dateOfBirth;
    private static List<Passport> passportList = new ArrayList<Passport>();

    public Passport(int passportNumber, String lastName, String firstName, String middleName, String dateOfBirth) {
        this.passportNumber = passportNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
    }

    public static Passport searchPassport(Passport searchPassport){
        for(Passport passport : passportList){
            if(passport.getPassportNumber() == searchPassport.getPassportNumber()){
                return searchPassport;
            }
        }
        return null;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNumber=" + passportNumber +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNumber == passport.passportNumber && Objects.equals(lastName, passport.lastName) &&
                Objects.equals(firstName, passport.firstName) && Objects.equals(middleName, passport.middleName) &&
                Objects.equals(dateOfBirth, passport.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber, lastName, firstName, middleName, dateOfBirth);
    }
}

