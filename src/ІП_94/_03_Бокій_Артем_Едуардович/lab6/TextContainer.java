package ІП_94._03_Бокій_Артем_Едуардович.lab6;

public class TextContainer implements ContainerInterface<String> {
    private String[] text;
    public TextContainer(String[] text) {
        System.out.println("Text container created");
        this.text = text;
    };
    public String[] getSortedContainer(SortingMethod sortingMethod) {
        System.out.println("Text Container getSortedContainer called");
        return (String[])sortingMethod.sort(text);
    }
}
