import java.util.ArrayList;
import java.util.List;

public class Numb {
    public static void main(String[] args) {
        Integer arr[] = new Integer[20];
        for(int i = 0; i <  arr.length; i++) {
            arr[i] =  (int)(Math.random() * 1000);
        }
        List<Integer> list = new ArrayList<Integer>(List.of(arr));
        list.removeIf(integer -> integer % 2 == 0);
        System.out.println(list);
    }
}
