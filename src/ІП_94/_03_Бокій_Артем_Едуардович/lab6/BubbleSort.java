package ІП_94._03_Бокій_Артем_Едуардович.lab6;

public class BubbleSort implements SortingMethod {

    @Override
    public Object[] sort(Object[] sortingData) {
        System.out.println("Bubble sort called on " + sortingData.getClass().getName());
        return sortingData;
    }
}
