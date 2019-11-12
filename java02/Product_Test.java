import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Product_Test {
    @Test
    public void sortPrice() {
        //Given
        rdString rs = new rdString();
        ArrayList<Product> ar = new ArrayList<Product>();
        String arrayName[] = new String[5];
        Integer arrayPrice[] = new Integer[5];

        for (int i = 0; i < arrayName.length; i++) {
            arrayName[i] = "Product" + rs.generateRdString(new Random(), rdString.text, 3);
        }

        for (int i = 0; i < arrayPrice.length; i++) {
            arrayPrice[i] = Integer.parseInt(rs.generateRdString(new Random(), rdString.number, 2)) * 1000;
        }

        Arrays.sort(arrayPrice, Collections.reverseOrder());
        Collections.shuffle(Arrays.asList(arrayName));
        for (int i = 0; i < arrayName.length; i++) {
            ar.add(new Product(arrayName[i] + " ", arrayPrice[i]));
        }


        //When
        ar.sort(new SortByPrice());

        //Then
        System.out.println("\nSorted by Price");
        for (int i = 0; i < ar.size(); i++){
            System.out.println(ar.get(i));
            String expected = arrayName[i] + " " + arrayPrice[i];
            Assert.assertEquals(expected, String.valueOf(ar.get(i)));
        }


        ;
    }
}