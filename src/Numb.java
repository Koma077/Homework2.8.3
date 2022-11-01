import java.util.*;

public class Numb {
//    public static void main(String[] args) {
//        Set<Integer> newSet = new HashSet<>();
//        for (int i = 0; i < 20; i++) {
//            newSet.add((int) (Math.random() * 1000));
//        }
//        newSet.removeIf(number -> number % 2 == 1);
//        System.out.println(newSet);
//
//    }
//}
    public static Set<Integer> randomNumbers() {
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            double random = Math.random() * 1000;
            integers.add((int) random);
        }
        integers.removeIf(integer -> integer % 2 == 1);
        System.out.println(integers);
        return integers;
    }


    public static void main(String[] args) {

    }
}




