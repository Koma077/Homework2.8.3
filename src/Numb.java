import java.util.*;

public class Numb {



    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> number = new HashSet<>();
        while (number.size() != 20) {
            number.add(random.nextInt(1000));
            number.removeIf(integer -> integer % 2 != 0);
        }
            System.out.println(number);

    }
}











