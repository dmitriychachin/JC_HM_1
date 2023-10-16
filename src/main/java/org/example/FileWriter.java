package org.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileWriter {
    public static void writeToFile(String record) throws IOException {
        File recFile = new File("C:\\Users\\chach\\Documents\\record.txt");
        if (recFile.exists() && !recFile.isDirectory()){
            FileOutputStream outputStream = new FileOutputStream(recFile);
            byte[] buffer = record.getBytes();
            outputStream.write(buffer);
            outputStream.close();
            System.out.println("Заметка успешно добавлена");
        }
        else{
            try {
                recFile.createNewFile();
            }
            catch (IOException e){
                throw new RuntimeException(e);
            }
            writeToFile(record);
        }
    }
}
