package serenityClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    private String[] productName ={
            "Product A",
            "Product B",
            "Product C",
            "Product D",
            "Product E",
            "Product F"
    };

    public List<Product> getRandomProductList(){
        Random rd = new Random();
        int lenght = rd.nextInt(10) + 1;
        System.out.println(lenght);
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < lenght; i++){
            Product product = new Product();
            product.Name = productName[rd.nextInt(productName.length)];
            product.Price = rd.nextInt(50000000);
            productList.add(product);
        }
        return productList;
    }

    public List<Product> sortDesc(List<Product> list){
        Product tempNum = new Product();
        for(int i = 0; i < list.size() - 1; i++){
            for(int j = i + 1; j < list.size(); j++){
                if (list.get(i).Price < list.get(j).Price){
                    tempNum = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tempNum);
                }
            }

        }
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).Name);
            System.out.println(list.get(i).Price);
            System.out.println();
        }
        return list;
    }

}
