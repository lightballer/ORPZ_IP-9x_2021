package ІП_94._03_Бокій_Артем_Едуардович.lab4;

public interface FileInterface {
    void open(String path, boolean createIfNotExist);
    void close();
    void delete(String path);
}
