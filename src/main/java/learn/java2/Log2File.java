package learn.java2;

public class Log2File implements  ILog {
    public void write(String content){
        System.out.println("Log to file " + content);
    }
}
