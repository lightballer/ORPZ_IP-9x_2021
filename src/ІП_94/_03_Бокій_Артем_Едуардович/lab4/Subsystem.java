package ІП_94._03_Бокій_Артем_Едуардович.lab4;

public class Subsystem {
    String filename1;
    String filename2;
    String filename3;
    String dirname1;
    String dirname2;
    FileInterface fileCreator1;
    FileInterface fileCreator2;
    FileInterface fileCreator3;
    DirectoryInterface directoryCreator1;
    DirectoryInterface directoryCreator2;

    Subsystem(String filename1, String filename2, String filename3, String dirname1, String dirname2) {
        this.filename1 = filename1;
        this.filename2 = filename2;
        this.filename3 = filename3;
        this.dirname1 = dirname1;
        this.dirname2 = dirname2;

        fileCreator1 = new FileCreator();
        fileCreator2 = new FileCreator();
        fileCreator3 = new FileCreator();
        directoryCreator1 = new DirectoryCreator();
        directoryCreator2 = new DirectoryCreator();
    }
    void create() {
        fileCreator1.open(filename1.toString(), true);

        fileCreator2.open(filename2.toString(), true);

        fileCreator3.open(filename3.toString(), true);

        directoryCreator1.create(dirname1);

        directoryCreator2.create(dirname2);
    }

    void destroy() {
        fileCreator1.delete(filename1);
        fileCreator2.delete(filename2);
        fileCreator3.delete(filename3);
        directoryCreator1.rmdir(dirname1);
        directoryCreator2.rmdir(dirname2);
    }

}
