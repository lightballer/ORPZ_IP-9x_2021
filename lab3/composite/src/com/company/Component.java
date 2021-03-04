package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

abstract public class Component {
    String name;
    List<Component> components = new ArrayList<Component>();
    abstract public void add(Component component);
    abstract public void remove(int index);
}
