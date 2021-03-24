package ІП_94._03_Бокій_Артем_Едуардович.lab4;

import java.io.File;

public class DirectoryCreator implements DirectoryInterface{
    DirectoryCreator() {}

    @Override
    public void create(String path) {
        File dir = new File(path);
        if (dir.mkdir()) {
            System.out.println("Directory " + dir.getPath() + " successfully created");
        } else {
            // dir already exists
            System.out.println("Directory " + path + " already exists");
        }
    }

    @Override
    public void rmdir(String path) {

        if (new File(path).delete()) {
            System.out.println("Directory " + path + " successfully deleted");
        } else {
            // cant delete dir
            System.out.println("Error occurred with removing directory " + path);
        }
    }
}
