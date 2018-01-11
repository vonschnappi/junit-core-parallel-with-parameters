import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;


public class TestWithParams {

    static private int i = 0;
    private int itemIndex;
    
    public TestWithParams(){
        /*
            static int i is incremented  and passed to the instance's itemIndex member everytime a 
            new instance of the test class is created. This way, the itemIndex member is unique 
            for each instance
        */
        i += 1;
        itemIndex = i;
    }
    
    private ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(45, 65, 78, 120, 76, 98));
    private ArrayList<String> words = new ArrayList<String>(Arrays.asList("Beers", "Bananas", "Apples", "Biscuits", "Burgers", "Balloons"));
    
    
    @Test
    public void test(){

        System.out.println("For this test instance, " + numbers.get(itemIndex) + " " + words.get(itemIndex) + " was given as parameter");
    }
}
