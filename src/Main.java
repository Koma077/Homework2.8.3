public class Main {
    public static void main(String[] args) {

        Passport passport1 = new Passport(523659, "Горин", "Иван", "Анатольевич", "22.05.1985");
        Passport passport2 = new Passport(458962, "Грин", "Руслан", "Иванович", "15.09.1995");
        Passport passport3 = new Passport(325698, "Усс", "Артур", "Александрович", "11.06.1989");


        System.out.println(Passport.searchPassport(new Passport(523659, "Горин", "Иван",
                "Анатольевич", "22.05.1985")));
        System.out.println(Passport.searchPassport(new Passport(325698, "Усс", "Артур",
                "Александрович", "11.06.1989")));


    }
}
