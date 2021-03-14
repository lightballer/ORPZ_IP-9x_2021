package ІП_94._03_Бокій_Артем_Едуардович.lab4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileCreator implements FileInterface{
    FileInputStream fileInputStream;
    FileCreator() {}

    @Override
    public void open(String path, boolean createIfNotExist) {
        if (!createIfNotExist) return;
        File file;
        try {
            file = new File(path);
            if (file.createNewFile()) {
                fileInputStream = new FileInputStream(file);
                System.out.println("File " + path + " successfully created ");
            } else {
                file.delete();
                file.createNewFile();
                System.out.println("File " + path + " successfully truncated");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    @Override
    public void close() {
        try {
            fileInputStream.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    @Override
    public void delete(String path) {
        if (new File(path).delete()) {
            System.out.println("File " + path + " successfully deleted");
        } else {
            System.out.println("Error occurred with deleting file " + path);
        }

    }
}
