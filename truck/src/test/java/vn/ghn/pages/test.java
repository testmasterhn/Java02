package vn.ghn.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
        public static void main(String[] args) throws ParseException {
//                Random rd = new Random();
//                String[] minute = {
//                        "00",
//                        "15",
//                        "30",
//                        "45"
//                };
//                String [] AMPM = {
//                        "AM",
//                        "PM"
//                };
//            String time2 = rd.nextInt(12) + ":" + minute[rd.nextInt(minute.length)] + " " + AMPM[rd.nextInt(AMPM.length)];
//            System.out.println(time2);
//            Date a = new Date();
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm");
            String date1 = "30/05/2020 10:11";
            String date2 = "30/05/2020 10:12";
            Date date11 = format.parse(date1);
            Date date22 = format.parse(date2);
            System.out.println(date11);
            if (date11.compareTo(date22) <= 0) {
                System.out.println("earlier");
            }
        }

    }

