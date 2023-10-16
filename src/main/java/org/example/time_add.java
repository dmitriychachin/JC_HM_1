package org.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class time_add {
    public static String add_time(String message){
        String data = time_find();
        String message_and_data = new StringBuilder().append(message).append(" ").append(data).toString();
        return message_and_data;
    }

    public static String time_find(){
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(Calendar.getInstance().getTime());
        return timeStamp;
    }
}
