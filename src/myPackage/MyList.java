package myPackage;

import ІП_90._00_Алещенко_Олексій_Вадимович.lab4.SeaBoat;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList implements List<SeaBoat> {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<SeaBoat> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(SeaBoat seaBoat) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends SeaBoat> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends SeaBoat> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public SeaBoat get(int index) {
        return null;
    }

    @Override
    public SeaBoat set(int index, SeaBoat element) {
        return null;
    }

    @Override
    public void add(int index, SeaBoat element) {

    }

    @Override
    public SeaBoat remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<SeaBoat> listIterator() {
        return null;
    }

    @Override
    public ListIterator<SeaBoat> listIterator(int index) {
        return null;
    }

    @Override
    public List<SeaBoat> subList(int fromIndex, int toIndex) {
        return null;
    }
}
