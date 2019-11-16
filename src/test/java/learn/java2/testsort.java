package learn.java2;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
public class testsort {
     @Test
  public void checksort(){
      boolean result=false;
      List<product> x=app.randomproduct();
      List<product> y= app.sortASC(x);
      for (int i=0;i<y.size()-1;i++){
          for (int j=i+1;j<y.size();j++){
              if (y.get(i).price<=y.get(j).price){
                  result=true;
              }else {
                  result=false;
                  break;
              }
          }
      }
      Assert.assertTrue(result);
  }

}
