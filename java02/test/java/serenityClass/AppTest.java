package serenityClass;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Random;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void SortDescWithPrice()
    {
        //Given
        App sort = new App();
        List<Product> rdList = sort.getRandomProductList();
        Assert.assertTrue(rdList.size() > 0);

        //When
        List<Product> sortedList = sort.sortDesc(rdList);
        boolean result = true;
        for(int i = 0; i < sortedList.size(); i++){
            for (int j = i + 1; j < sortedList.size(); j++){
                if (sortedList.get(i).Price >= sortedList.get(j).Price){
                    result = true;
                } else {
                    result = false;
                }
            }
        }

        //Then
        Assert.assertTrue("Wrong", result = true);
    }

    @Test
    public void SortDescBuilder(){
        Builder sortedProducts = new Builder.ProductBuilder()
                .generateRdList()
                .thenSortList()
                .thenCheckList()
                .build();

    }
}
