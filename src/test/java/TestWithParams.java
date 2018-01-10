import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;


public class TestWithParams {

    static private int i = 0;
    private ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(45, 65, 78, 120, 76, 98));
    private ArrayList<String> words = new ArrayList<String>(Arrays.asList("Beers", "Bananas", "Apples", "Biscuits", "Burgers", "Balloons"));

    @Test
    public void test(){

        System.out.println("For this test instance, " + numbers.get(i) + " " + words.get(i) + " was given as parameter");
        i += 1;
    }

}
