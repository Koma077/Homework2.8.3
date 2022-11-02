import java.util.*;

public class MultiplicationTable {
    private static Set<String> setTask = new HashSet<>();

    public static String generateNumber() {
        int x;
        int y;
        Random random = new Random();
        x = random.nextInt(10);
        y = random.nextInt(10);
        return x + "*" + y;
    }

    public static void main(String[] args) {
        int count = 0;
        while (count < 15) {
            String pairNumber = generateNumber();
            String inverseNumber = pairNumber.charAt(2) + "*" + pairNumber.charAt(0);
            if (!setTask.contains(pairNumber) && !setTask.contains(inverseNumber)) {
                setTask.add(pairNumber);
                count++;
            }
        }
        System.out.println(setTask);
    }
}

