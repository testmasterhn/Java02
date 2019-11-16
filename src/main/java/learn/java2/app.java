package learn.java2;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import  java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class app {
    private static String[] a= {"San pham A","San pham B","San pham C","San pham D","San pham E","San pham F","San pham G","San pham H",};

    public  static  List<product> randomproduct(){
        Random rd=new Random();
        int numProduct=rd.nextInt(10);
        List<product> pr=new ArrayList<product>();

        for(int i=0;i<numProduct;i++) {
            product p=new product();
            p.price = rd.nextInt(2000000);
            p.name = a[rd.nextInt(a.length)].toString();
            pr.add(p);
        }
        return pr;
    }

    public static  List<product> sortASC(List<product> x){
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


    public static void main(String[] args){
        List<product> x= randomproduct();
        for(product i:x){
            System.out.println(i.name +" " + i.price);
        }
        List<product> y=sortASC(x);
        System.out.println("\n");
        for(product i:y){
            System.out.println(i.name +" " + i.price);
        }

    }


}
