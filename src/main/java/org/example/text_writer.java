package org.example;

import java.util.Scanner;

public class text_writer {
    public static String messageWrite() {
        Scanner insys = new Scanner(System.in);
        System.out.println("Введите заметку:");
        String message = insys.nextLine();
        insys.close();
        return message;
    }
}
