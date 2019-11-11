import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Product_Test {
    @Test
    public void sort()
    {
        //Given
        ArrayList<Product> ar = new ArrayList<Product>();
        String arrayName[] = {"Product A", "Product B", "Product C", "Product D", "Product E"};
        Integer arrayPrice[] = {25000, 150000, 40000, 30000, 50000};
        Arrays.sort(arrayPrice, Collections.reverseOrder());
        Collections.shuffle(Arrays.asList(arrayName));
        for(int i = 0; i < arrayName.length; i++ ){
            ar.add(new Product(arrayName[i] + " ", arrayPrice[i]));
        }


        //When
        ar.sort(new SortByPrice());

        //Then
        System.out.println("\nSorted by Price");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
        String expected = arrayName[0] + " " + arrayPrice[0];
        Assert.assertEquals(expected, String.valueOf(ar.get(0)));
    }
}
