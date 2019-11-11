import java.util.*;
import java.lang.*;

public class Product
{
    public String productName;
    public int productPrice;

    public Product(String productName,
                   int productPrice)
    {
        this.productName = productName;
        this.productPrice = productPrice;
    }



    public String toString()
    {
        return this.productName + this.productPrice;
    }
}

class SortByPrice implements Comparator<Product>
{
    public int compare(Product a, Product b)
    {
        return b.productPrice - a.productPrice;
    }
}

class rdString {
    static String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
    static String number = "12345677890";
    public String generateRdString(Random random, String characters, int length){

        char[] text = new char[length];
        for(int i = 0; i < length; i++){
            text[i] = characters.charAt(random.nextInt(characters.length()));
        }

        String newString = new String(text);
        return newString;
    }

}

