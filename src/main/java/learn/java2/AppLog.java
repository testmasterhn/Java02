package learn.java2;



import java.util.Random;

public class AppLog {
    public static void main(String[] srgs){
        ILog log ;
        String s="test log ";
        Random rd=new Random();
        int n=rd.nextInt(100);
        if(n%2==0){
            log=new Log2Email();
        }else if(n%3==0){
            log=new Log2Screen();
        }else {
            log=new Log2File();
        }
        log.write("\n test interface");
        }
}
