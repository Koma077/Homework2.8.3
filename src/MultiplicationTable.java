import java.util.Arrays;
import java.util.Collections;

public class MultiplicationTable {
    public static void main(String[] args) {
        String[] tasksArray = tasksArray();
        for (int i = 0; i < 15; i++) {
            System.out.println(tasksArray[i]);
        }
    }

    public static String[] tasksArray() {
        String[] tasksArray = new String[36];
        int n = 0;
        for (int i = 2; i <= 9; i++) {
            for (int j = i; j <= 9; j++) {
                tasksArray[n] = i + " × " + j + " = o_o";
                n++;
            }
        }
        Collections.shuffle(Arrays.asList(tasksArray));
        return tasksArray;
    }
}