package learn.java2;

public class Log2Screen implements ILog {
    public void write(String content) {
        System.out.println("Log to screen"+content);
    }
}
