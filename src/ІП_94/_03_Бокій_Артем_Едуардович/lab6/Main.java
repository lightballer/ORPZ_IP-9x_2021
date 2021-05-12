package ІП_94._03_Бокій_Артем_Едуардович.lab6;

public class Main {
    public static void main(String[] args) {
        String[] text = {"Some text", "Lorem ipsum", "dolor sit amet"};
        Integer[] numbers = {8, 8, 0, 0, 5, 5, 5, 3, 5, 3, 5};
        Container container = new Container();

        container.setContainerType(new TextContainer(text));

        container.setSortingMethod(new BubbleSort());
        container.executeSorting();

        container.setSortingMethod(new PyramidSort());
        container.executeSorting();

        container.setContainerType(new NumbersContainer(numbers));

        container.setSortingMethod(new BubbleSort());
        container.executeSorting();

        container.setSortingMethod(new PyramidSort());
        container.executeSorting();

    }
}
