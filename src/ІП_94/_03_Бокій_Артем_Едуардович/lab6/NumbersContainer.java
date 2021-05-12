package ІП_94._03_Бокій_Артем_Едуардович.lab6;

public class NumbersContainer implements ContainerInterface {
    private Integer numbers[];

    public NumbersContainer(Integer numbers[]) {
        System.out.println("Numbers container created");
        this.numbers = numbers;
    }

    @Override
    public Integer[] getSortedContainer(SortingMethod sortingMethod) {
        System.out.println("Numbers Container getSortedContainer called");
        return (Integer[]) sortingMethod.sort(numbers);
    }
}
