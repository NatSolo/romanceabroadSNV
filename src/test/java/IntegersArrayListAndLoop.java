import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegersArrayListAndLoop {
    @Test
    public void test210() {

        for (int i = 0; i < 50; i++) {
            System.out.println("Hi guys!");
        }
    }

    @Test
    public void test21() {
        List<Integer> fruitsList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        for (int i = 0; i < fruitsList1.size(); i++) {
            int element = fruitsList1.get(i);
            System.out.println(element);
        }

    }

    @Test
    public void test22() {
        List<Integer> fruitsList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        System.out.println(fruitsList1.size());
        fruitsList1.add(10);
        System.out.println(fruitsList1.size());
        for (int i = 0; i < fruitsList1.size(); i++) {
            int element = fruitsList1.get(i);
            System.out.println(element);

        }

    }

}
