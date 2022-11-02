import java.util.HashSet;
import java.util.Set;

public class PasportList {

    private static Set<Passport> passportList = new HashSet<>();

    public static Passport searchPassport(Passport searchPassport){
        for(Passport passport : passportList){
            if(passport.getPassportNumber() == searchPassport.getPassportNumber()){
                return searchPassport;
            }
        }
        return null;
    }
    public static void addNewPasport(Passport newPasport) {
        boolean checkNewPasport = true;
        for (Passport passport : passportList) {
            if (passport.getPassportNumber() == newPasport.getPassportNumber()) {
                passport.setFirstName(newPasport.getFirstName());
                passport.setLastName(newPasport.getLastName());
                passport.setDateOfBirth(newPasport.getDateOfBirth());
                passport.setMiddleName(newPasport.getMiddleName());
                checkNewPasport = false;
                break;
            }
        }
        if (checkNewPasport) {
            passportList.add(newPasport);
        }
    }
}
