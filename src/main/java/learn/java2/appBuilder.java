package learn.java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class appBuilder {
    private static   String[] a= {"San pham A","San pham B","San pham C","San pham D","San pham E","San pham F","San pham G","San pham H",};

    public  static  List<product> randomproductbuilder(){
            Random rd=new Random();
            int numProduct=rd.nextInt(10)+1;
            List<product> pr=new ArrayList<product>();

            for(int i=0;i<numProduct;i++) {
                product p=new product.productBuilder().nameBuilder(a[rd.nextInt(a.length)].toString()).priceBuilder(rd.nextInt(500000)).build();
                pr.add(p);
            }
            return pr;
        }

    public static  List<product> sortBuilderASC(List<product> x){
        product temp= new product();
        for (int i=0;i<x.size()-1;i++)
            for (int j=i+1;j<x.size();j++){
                if(x.get(i).price>x.get(j).price){
                    temp=x.get(i);
                    x.set(i,x.get(j));
                    x.set(j,temp);
                }
            }
        return x;
    }
/*
    public static void main(String[] args) {
        List<product> lp = randomproductbuilder();
        for (product j:lp){
            System.out.println(j.name + " " + j.price );
        }
        System.out.println("\n");
        lp=sortBuilderASC(lp);
        for (product i:lp){
            System.out.println(i.name + " " + i.price );
        }
    }

 */


}

