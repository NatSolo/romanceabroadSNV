import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringsArrayListsAndLoops {
    //String Array Lists

    @Test

    public void test25() {
        List<String> fruitlist3 = new ArrayList<>(Arrays.asList("kiwi", "orang", "melon"));
        String element = fruitlist3.get(0);
        System.out.println(element);

    }

    @Test

    public void test26() {
        List<String> fruitlist3 = new ArrayList<>(Arrays.asList("kiwi", "orang", "melon"));
        if (fruitlist3.contains("orange"))
            System.out.println(fruitlist3);

    }

    @Test
    public void test27() {
        List<String> fruitList3 = new ArrayList<>(Arrays.asList("kiwi", "orang", "melon"));
        System.out.println(fruitList3.size());
        fruitList3.add("apple");
        System.out.println(fruitList3.size());
        for (int i = 0; i < fruitList3.size(); i++) {
            String element = fruitList3.get(i);
            System.out.println(element);

        }
    }

    @Test
    public void test28() {
        List<String> fruitList4 = new ArrayList<>(Arrays.asList("kiwi", "orang", "melon"));
        System.out.println(fruitList4.size());
        fruitList4.add("apple");
        System.out.println(fruitList4.size());
        for (int i = 0; i < fruitList4.size(); i++) {
            String element = fruitList4.get(i);
            if (element.contains("me")) {
                System.out.println("Melon is inside list");

            }
        }
    }

    @Test
    public void test29() {
        String phrase = "Melon is inside list";
        List<String> fruitList4 = new ArrayList<>(Arrays.asList("kiwi", "orang", phrase));
        fruitList4.add("apple");
        System.out.println(fruitList4);
        for (int i = 0; i < fruitList4.size(); i++) {
            String element = fruitList4.get(i);
            System.out.println(i + "iteration");
            if (element.contains("me")) {
                System.out.println(phrase);

            }
        }
    }

    @Test
    public void test30() {
        String phrase = "Melon is inside list";
        List<String> fruitList4 = new ArrayList<>(Arrays.asList("kiwi", "orange", phrase));
        fruitList4.add("apple");
        System.out.println(fruitList4);
        for (int i = 0; i < fruitList4.size(); i++) {
            String element = fruitList4.get(i);
            System.out.println(i + "iteration");
            if (element.contains("me")) {
                System.out.println(phrase);
            }
            if (element.equals("orange")) {
                System.out.println("Orange");
            }
            if (element.contains("i")) {
                System.out.println("IIIII");
            } else {
                System.out.println("Bad loop");
            }

        }

    }

    @Test
    public void test31() {
        String phrase = "Melon is inside list";
        List<String> fruitList4 = new ArrayList<>(Arrays.asList("kiwi", "orange", phrase));
        fruitList4.add("apple");
        System.out.println(fruitList4);
        for (int i = 0; i < fruitList4.size(); i++) {
            String element = fruitList4.get(i);
            System.out.println(i + "iteration");
            if (element.contains("me")) {
                System.out.println(phrase);
                continue;
            } else {
                System.out.println("Bad loop");
            }
        }

    }

    @Test
    public void test32() {
        String phrase = "Melon is inside list";
        List<String> fruitList5 = new ArrayList<>(Arrays.asList("kiwi", "apple", phrase));
        fruitList5.add("melon");
        System.out.println(fruitList5);
        for (int i = 0; i < fruitList5.size(); i++) {
            String element = fruitList5.get(i);
            System.out.println(i + "iteration");

            if (element.contains("apple")) {
                System.out.println(phrase);
                break;
            }

        }

    }

    @Test
    public void test33() {
        String phrase = "Melon is inside list";
        List<String> fruitList5 = new ArrayList<>(Arrays.asList("kiwi", "apple", phrase));
        fruitList5.add("melon");
        System.out.println(fruitList5);
        for (int i = 0; i < fruitList5.size(); i++) {
            String element = fruitList5.get(i);
            System.out.println(i + "iteration");
            System.out.println(phrase);
            break;
        }

    }

    @Test
    public void test34() {
        String phrase = "Melon is inside list";
        List<String> fruitList5 = new ArrayList<>(Arrays.asList("kiwi", "apple", phrase));
        fruitList5.add("melon");
        System.out.println(fruitList5);
        for (int i = 0; i < fruitList5.size(); i++) {
            String element = fruitList5.get(i);
            System.out.println(i + "iteration");
            continue;
        }

    }  // doesn't give any information instead iteration. it nee to add some conditions anyway

}




