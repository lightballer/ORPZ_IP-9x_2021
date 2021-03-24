package ІП_94._03_Бокій_Артем_Едуардович.lab5;

public class Main {
    public static void main(String[] args) {
        Aggregate concreteAggregate = new ConcreteAggregate();
        Iterator iterator = concreteAggregate.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
