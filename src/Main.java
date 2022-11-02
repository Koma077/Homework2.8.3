public class Main {
    public static void main(String[] args) {
        PasportList pasportList = new PasportList();

        pasportList.addNewPasport(new Passport(523659, "Горин", "Иван", "Анатольевич", "22.05.1985"));
        pasportList.addNewPasport(new Passport(458962, "Грин", "Руслан", "Иванович", "15.09.1995"));
        pasportList.addNewPasport(new Passport(325698, "Усс", "Артур", "Александрович", "11.06.1989"));

        System.out.println(pasportList.searchPassport(new Passport(523659, "Горин", "Иван",
                "Анатольевич", "22.05.1985")));
        System.out.println(pasportList.searchPassport(new Passport(325698, "Усс", "Артур",
                "Александрович", "11.06.1989")));



    }
}
