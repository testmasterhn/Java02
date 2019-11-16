package serenityClass;

import org.junit.Assert;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Builder {

    private String productName;
    private int productPrice;

    public Builder(ProductBuilder builder){
        this.productName = builder.productName;
        this.productPrice = builder.productPrice;
    }

    public static class  ProductBuilder{
        Random rd = new Random();
        private String productName;
        private int productPrice;
        List<Product> productList;
        List<Product> sortedList;

        public List<Product> getRandomProductList(){
            String[] Name = {
                    "Product A",
                    "Product B",
                    "Product C",
                    "Product D",
                    "Product E",
                    "Product F"
            };
            int length = rd.nextInt(10) + 1;
            System.out.println(length);
            List<Product> productList = new ArrayList<>();
            for (int i = 0; i < length; i++){
                Product product = new Product();
                product.Name = Name[rd.nextInt(Name.length)];
                product.Price = rd.nextInt(5000000);
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

        public boolean resultValue(List<Product> sortedList){
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
            Assert.assertTrue("Wrong", result = true);
            return result;
        }

        public ProductBuilder generateRdList(){
            List<Product> rdList = getRandomProductList();
            this.productList = rdList;
            return this;
        }

        public ProductBuilder thenSortList(){
            List<Product> sortedList = sortDesc(productList);
            this.sortedList = sortedList;
            return this;
        }

        public ProductBuilder thenCheckList(){
            boolean result = resultValue(sortedList);
            return this;
        }

        public Builder build(){
            return new Builder(this);
        }

    }

}
