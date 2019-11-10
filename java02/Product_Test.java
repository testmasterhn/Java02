import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Product_Test {
    @Test
    public void sort()
    {
        //Given
        ArrayList<Product> ar = new ArrayList<Product>();
        ar.add(new Product("Product A ", 50000));
        ar.add(new Product("Product B ", 20000));
        ar.add(new Product("Product C ", 30000));
        Product expected = ar.get(1);

        //When
        Collections.sort(ar, new SortByPrice());

        //Then
        System.out.println("\nSorted by Price");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Assert.assertEquals(expected, ar.get(0));
    }
}
