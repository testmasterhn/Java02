package serenityClass;

import java.util.Random;

public class Log {
    interface LogMessage{
        void write(String content);
    }
    public class Log2Email implements LogMessage{
        public void write(String content){
            System.out.println("Log2Email " + content);
        }
    }

    public class Log2Screen implements LogMessage{
        public void write(String content){
            System.out.println("Log2Screen " + content);
        }
    }

    public class Log2File implements LogMessage{
        public void write(String content){
            System.out.println("Log2File " + content);
        }
    }

    public void checkNum(){
        Random rd = new Random();
        int rdNum = rd.nextInt(100);
        Log2Screen screen = new Log2Screen();
        Log2File file = new Log2File();
        Log2Email email = new Log2Email();
        System.out.println(rdNum);
        if (rdNum % 2 == 0){
            email.write("Đây là số chia hết cho 2");
        } else if (rdNum % 3 == 0){
            file.write("Đây là số chia hết cho 3");
        } else {
            screen.write("Số này không chia hết cho 2 hay 3");
        }
    }

    public static void main(String[] args) {
        Log a = new Log();
        a.checkNum();
    }
}
