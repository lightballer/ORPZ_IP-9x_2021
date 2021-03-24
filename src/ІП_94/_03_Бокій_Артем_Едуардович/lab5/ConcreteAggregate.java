package ІП_94._03_Бокій_Артем_Едуардович.lab5;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate{
    List<Integer> numbers;

    public ConcreteAggregate() {
        numbers = new ArrayList<>();

        int[] fibonacciNumbers = {1, 1, 2, 3, 5, 8, 13};
        for (int i = 0; i < fibonacciNumbers.length; i++) {
            numbers.add(fibonacciNumbers[i]);
        }
    }

    @Override
    public Iterator getIterator() {
        return new NumbersIterator();
    }

    private class NumbersIterator implements Iterator {

        int index = 0;

        @Override
        public Object next() {
            return numbers.get(index++);
        }

        @Override
        public boolean hasNext() {
            if (index < numbers.size()) return true;
            return false;
        }

    }
}
