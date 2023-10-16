package org.example;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        String message = text_writer.messageWrite();
        String record = time_add.add_time(message);
        FileWriter.writeToFile(record);
    }
}
