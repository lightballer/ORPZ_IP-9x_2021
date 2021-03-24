package ІП_94._03_Бокій_Артем_Едуардович.lab3;

import java.util.ArrayList;
import java.util.List;

class Toolbar implements Tool {
    List<Tool> components = new ArrayList<>();

    @Override
    public void acting() {
        for (Tool component: components) {
            component.acting();
        }
    }
    public void addComponent(Tool tool) {
        components.add(tool);
    }

    public void removeComponent(Tool tool) {
        components.remove(tool);
    }
}
