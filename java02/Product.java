import java.util.*;
import java.lang.*;

class Product
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
        return a.productPrice - b.productPrice;
    }
}